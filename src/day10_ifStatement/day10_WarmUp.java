package day10_ifStatement;

public class day10_WarmUp {

    public static void main(String[] args) {
        /*
        * 1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
                        * /
                        */


        char character = 124;

        char char1 = 65;
        char char2 = 90;
        char char3 = 97;
        char char4 = 122;

        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            System.out.println(character + " is an Alphabetic");
        } else {
            System.out.println(character + " is not an Alphabetic.");
        }

/*2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit*/


        character = 97;
        char1 = 48;
        char2 = 57;

        if (character >= 48 && character <= 57) {
            System.out.println(character + " is a Digit");
        } else {
            System.out.println(character + " is not a Digit");
        }

/*3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol

        * */

        character = 65;
        char1 = 33;
        char2 = 47;
        char3 = 58;
        char4 = 64;
        char char5 = 91;
        char char6 = 96;
        char char7 = 123;
        char char8 = 127;

        if ((character >= 33 && character <= 47) || (character >= 58 && character <= 64)
                || (character >= 91 && character <= 96) || (character >= 123 && character <= 127)) {
            System.out.println(character + " is a symbol");
        } else {
            System.out.println(character + " is not a symbol");
        }

        character = 54;

        if ((character >= 33 && character <= 47) || (character >= 58 && character <= 64)
                || (character >= 91 && character <= 96) || (character >= 123 && character <= 127)) {
            System.out.println(character + " is a symbol");
        } else if (character >= 48 && character <= 57) {
            System.out.println(character + " is a Digit");
        } else if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            System.out.println(character + " is an Alphabetic");
        }

        /*HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers). Part of the protocol includes
         a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and
         their meanings are listed below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
        /'=+6+    NOTE: use single if statements ONLY. DO NOT use more that one print statement*/

        int statusCode = 0;
        int statusCode1 = 200;
        int statusCode2 = 201;
        int statusCode3 = 202;
        int statusCode4 = 301;
        int statusCode5 = 303;
        int statusCode6 = 304;
        int statusCode7 = 307;
        int statusCode8 = 400;
        int statusCode9 = 401;
        int statusCode10 = 403;
        int statusCode11 = 404;
        int statusCode12 = 410;
        int statusCode13 = 500;
        int statusCode14 = 503;

        if(statusCode1 == 200){
            statusCode1 = statusCode;
        }
        if(statusCode2 == 201) {
            statusCode2 = statusCode;
        }
        if(statusCode3 == 202) {
            statusCode3 = statusCode;
        }
        if(statusCode4 == 301) {
            statusCode4 = statusCode;
        }
        if(statusCode5 == 303) {
            statusCode5 = statusCode;
        }
        if(statusCode6 == 304) {
            statusCode6 = statusCode;
        }
        if(statusCode7 == 307) {
            statusCode7 = statusCode;
        }
        if(statusCode8 == 400) {
            statusCode8 = statusCode;
        }
        if(statusCode9 == 401) {
            statusCode9 = statusCode;
        }
        if(statusCode10 == 403) {
            statusCode10 = statusCode;
        }
        if(statusCode11 == 404) {
            statusCode11 = statusCode;
        }
        if(statusCode12 == 410) {
            statusCode12 = statusCode;
        }
        if(statusCode13 == 500) {
            statusCode13 = statusCode;
        }
        if(statusCode14 == 503) {
            statusCode14 = statusCode;
        }

        System.out.println(statusCode);










    }
}