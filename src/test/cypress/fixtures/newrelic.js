function handleNewRelicException(err) {
    console.warn(err);
    return !(err.message && err.message.startsWith("Cannot set property 'status' of undefined"));
}