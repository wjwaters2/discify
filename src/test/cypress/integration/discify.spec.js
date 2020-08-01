describe('Discify', function () {

    it('gets record data from spotify and creates a discogs release', function () {
        cy.visit('/getAlbum?id=4SEG0tkPNvYmlGKlexNM3l');
        cy.get('#name').invoke('text').as('name');

        cy.get('#navigation-button').click(); //TODO test passes but cypress will not allow navigation to a different root url
    });
});