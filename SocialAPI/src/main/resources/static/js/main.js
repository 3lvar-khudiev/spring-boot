$(".first-col1").mouseenter(function () {
    $(this).animate({
        left: '68px'
    }, 200);
});

$(".first-col1").mouseleave(function () {
    $(this).animate({
        left: '0'
    });
});

$(".last-col1").mouseenter(function () {
    $(this).animate({
        right: '68px'
    }, 200);
});

$(".last-col1").mouseleave(function () {
    $(this).animate({
        right: '0'
    });
});