<html>
    <head>
        <title>Users</title>
    </head>
    <body>
        <% def userList = request.getAttribute('userList') %>
        <% userList.each { %>
        <div class="col-md-2 col-sm-3 col-xs-6 browseImage">
            <div class="thumbnail">
                <div class="image" style="height: 162px; overflow-y: hidden; background-color: #F5F5F5;">
                    <a href="https://github.com/${it.username}">
                        <img alt="" src="https://github.com/${it.username}.png?size=200" style="max-height: 200px;">
                    </a>
                </div>
                <a href="https://github.com/${it.username}">
                    @${it.username}
                </a>
                <br/>
                <a href="/unban/${it.username}">Unban</a>
            </div>
        </div>
        <% } %>
    </body>
</html>