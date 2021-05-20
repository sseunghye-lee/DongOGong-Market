function alertMessage(msg) {
    const toastFrame = $('<div class="toast" role="alert" aria-live="assertive" aria-atomic="true"></div>');

    const toastHeader = $('<div class="toast-header bg-light"></div>');

    const toastHeaderTitle = $('<strong class="mr-auto">알림</strong>');
    toastHeader.append(toastHeaderTitle);

    const toastHeaderTime = $('<small class="text-muted">지금</small>');
    toastHeader.append(toastHeaderTime);

    const toastHeaderClose = $('<button type="button" class="ml-2 close text-sm" data-dismiss="toast" aria-label="Close"><span aria-hidden="true">&times;</span></button>');
    toastHeader.append(toastHeaderClose);

    const toastBody = $('<div class="toast-body bg-white"></div>');
    toastBody.text(msg);

    toastFrame.append(toastHeader);
    toastFrame.append(toastBody);

    const toastContainers = $(".toast-container");
    if (toastContainers.length > 0) {
        toastContainers.append(toastFrame);
    }

    toastFrame.toast({
        delay: 2000
    }).toast('show');
}

function pureText(data) {
    let newData;
    let regExp = /[\{\}\[\]\/?.,;:|\)*~`!^\-+<>@\#$%&\\\=\(\'\"]/gi;

    if (regExp.test(data)) {
        newData = data.replace(regExp, "");
    }
    return newData;

}
