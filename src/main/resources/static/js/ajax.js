$(function(){
    $("#more").click(function() {
        console.log("clicked");
        var last_page = parseInt($(this).attr("last-page")) + 1;

        $.ajax({
            method:"GET",
            url: "/api/getNextList",
            data : {"page":last_page}
        })
        .done(function(response){
            console.log("done");
            console.log(response);
            if(response.length > 0) {
                for(var blog of response) {
                    $("#more-blogs").append(
                    "<div>" +
                        "<a href=\"#\">" +
                            "<h2>" + blog.title + "</h2>" +
                            "<h3>" + blog.content + "</h3>" +
                        "</a>" +
                        "<p>" +
                            "Bloged by " + blog.username +
                        "</p>" +
                    "</div>"
                    );
                }
            }
            else {
                alert('last data');
            }
        })
        .always(function(response){
            console.log("always");
            console.log(response);
        });
        $(this).attr("last-page", last_page);
    });
});