$(function () {
    function readURL(input) {
        if (input.files && input.files[1]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('#image').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }



    $("#fileInput").change(function () {
        console.log(this.files);
        for (var i = 0; i < this.files.length; i++) {
            if (this.files && this.files[i]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $(".imagelist").append("<img id='image' class='img-thumbnail' src='" + e.target.result + "' alt='uploaded image " + i + "' />");
                }
                reader.readAsDataURL(this.files[i]);
            }
        }
    });

    $("#upload").click(function () {
        // handle uploading to Azure
        console.log("hey");

        setTimeout(function () {
            $("#upload").parent().append("<p> Success </p>");
        }, 1000);

        setTimeout(function () {
            window.location.replace("processing.html");
        }, 1100);
    });
    num = 0;
    $("#match").click(function () {
        num++;
        if (num > 3) {
            $("img").parent().parent().html("<h1 class='msg text-center'>We are all out of Pairs!</h1>");
            setTimeout(function () {
                window.location.replace("diagnostics.html");
            }, 1100);
        }
    });

});
