package src.ai.polito;

import java.util.stream.IntStream;

public class IntStreamReducer {

    public int reduce(IntStream s){
        return s.reduce((a,b)->a+b).getAsInt();
    }
}
