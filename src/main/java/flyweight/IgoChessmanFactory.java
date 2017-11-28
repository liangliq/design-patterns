package flyweight;

import java.util.HashMap;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 */
public class IgoChessmanFactory {

    private static IgoChessmanFactory INSTANCE= new IgoChessmanFactory();

    private HashMap chessmanMap = new HashMap();

    private IgoChessmanFactory(){

        BlackIgoChessman blackIgoChessman = new BlackIgoChessman();
        chessmanMap.put("Black", blackIgoChessman);
        WhiteIgoChessman whiteIgoChessman = new WhiteIgoChessman();
        chessmanMap.put("White", whiteIgoChessman);

    }

    public static IgoChessmanFactory getInstance(){
        return INSTANCE;
    }

    public AbstractIgoChessman getIgoChessman(String color){
        return (AbstractIgoChessman) chessmanMap.get(color);
    }

}
