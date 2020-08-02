describe('Discify', function () {
    Cypress.on('uncaught:exception', (err) => {
        return handleNewRelicException(err);
    });

    it('pulls data from spotify', function () {
        cy.visit('/getAlbum?id=4SEG0tkPNvYmlGKlexNM3l');
        cy.get('#name').invoke('text').as('name');
    });

    it('sends data to discogs', function () {
        cy.server();
        cy.fixture('../../src/test/resources/dataFiles/4SEG0tkPNvYmlGKlexNM3l.json').as('spotifyData');
        cy.get('@spotifyData').its('id').should('eq', '4SEG0tkPNvYmlGKlexNM3l');
        cy.visit('www.discogs.com');
        cy.get('#log_in_link').click();
        cy.get('#username').type('{user-name}');
        cy.get('#password').type('{password}');
        cy.get('button[name="submit"]').click();
        let albumName = cy.get('@spotifyData').its('name');
        cy.get('#search_q').type(albumName.invoke('text'));
        cy.get('#do_site_search').click();
    });
});