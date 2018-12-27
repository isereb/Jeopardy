$(document).ready(function () {
    var doc = $(this);
    var options = doc.find(".options");
    var clicked = false;
    options.children().click(function (event) {
        if (clicked === false) {
            clicked = true;
            console.log("option id: " + event.target.id)
            $.ajax({
                url: path + "/question",
                method: "post",
                data: {
                    "c": category,
                    "v": value,
                    "option": event.target.id
                },
                success: function (result) {
                    result = (result) ? JSON.parse(result) : "";
                    if (result.correct === true) {
                        $(event.target).addClass("right");
                    } else {
                        $(event.target).addClass("wrong");
                        options.find("#" + result.option).addClass("right");
                    }
                    setTimeout(function () {
                        window.location.replace(path + "/categories");
                    }, 3000);
                },
                error: function (error) {
                    window.location.replace(path + "/categories");
                }
            });
        }
    });
});