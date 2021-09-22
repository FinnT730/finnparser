package cf.finnt730

class Parser {

    // [+!+[]]+[+[]]

    static Token returnToken(char _c) {
        switch (_c) {
            case '[':{
                return Token.T_open;
                break;
            }
            case ']':{
                return Token.T_close;
                break;
            }
            case '!':{
                return Token.T_exclamation;
                break;
            }
            case '+':{
                return Token.T_plus;
                break;
            }
            default:
                return Token.T_null;
                break;
        }
    }

}
