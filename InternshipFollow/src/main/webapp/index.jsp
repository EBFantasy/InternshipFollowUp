<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Internship Follow-Up</title>
        <style>
            .loginContext {
                font-size: 30px;
                display: flex;
                flex-direction: column;
            }

            .loginContext .loginInput {
                background-color: transparent;
                border: none;
                border-bottom: solid 1px;
                height: 50px;
                margin: 25px;
                font-size: 24px;
            }

            .loginContext .loginInput:focus {
                outline: none;
            }

            .loginHead {
                position: relative;
                text-align: center;
                border-bottom: dashed 0.8ch;
                padding-bottom: 16px;
            }

            .loginSubmit {
                text-align: center;
                margin: 25px;
                text-decoration: none;
                font-weight: 800;
                color: blue;
                border: none;
                background-color: transparent;
                font-size: 30px;
                display: block;
                padding-top: 25px;
                margin: 0 auto;
                cursor: pointer;
            }

            .bk {
                width: 100%;
                height: 100%;
                position: absolute;
                left: 0;
                top: 0;
                z-index: -1;
            }

            .Box {
                width: 650px;
                height: 450px;
                padding: 40px;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                animation: animated-border 1.5s infinite;
                border: 2px solid;
                border-radius: 10px;
                padding: 15px;
                background-color: azure;
                background-size: cover;
                background-attachment: fixed;
            }
        </style>
        <script>
            // Write the models data entry here
        </script>
    </head>
    <body>
    <img class="bk" src="https://s2.loli.net/2023/02/16/ihXefda8mjFJ6Gk.jpg"/>
        <div class="Box">
            <div class="loginHead">
                <h1>Authentication</h1>
            </div>
            <br/>
            <div class="loginContext">
                <input class="loginInput" type="text" name="id" placeholder="Identification">
                <input class="loginInput" type="password" name="pwd" placeholder="Password">
                <form action="servletMain">
                    <input class="loginSubmit" type="submit" name="connect" value="CONNEXION"/>
                </form>
            </div>
        </div>
    </body>
</html>