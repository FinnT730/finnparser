package cf.finnt730

import groovy.transform.CompileStatic

@CompileStatic
class Parser {


    HashMap<Integer, Token> line_tokens = new HashMap<Integer, Token>();

    static void parseWords(String line) {
        line.split(' ')
        .eachWithIndex { String entry, int i ->
            switch (entry) {
                case "var": {
                    line_tokens[i] = Token.T_var;
                    var varname = line.split(' ')[i + 1]
//                    return Token.T_var;
                    break;
                }
                    case "=": {
                    // T_equals
                    line_tokens[i] = Token.T_equals;
                    break;
                }
                default : return Token.T_null;
            }
        }
    }


    // [+!+[]]+[+[]]
    static Token returnToken(char _c) {
        switch (_c) {
            case '[':{
                return Token.T_open;
            }
            case ']':{
                return Token.T_close;
            }
            case '!':{
                return Token.T_exclamation;
            }
            case '+':{
                return Token.T_plus;
            }
            default:
                return Token.T_null;
                break;
        }
    }

}
