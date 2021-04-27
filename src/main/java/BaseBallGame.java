import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BaseBallGame {

    List<String> targetNumberList = new ArrayList<>();
    ArrayList<Integer> numberPool;
    CheckResultModel checkResultModel = new CheckResultModel();
    int isEnd = 0;

    // TODO : 기본 값 생성
    public void init(){
        createNumberPool();
        makeTargetNumberList(3); // 자리수가 바뀔 경우 digit을 변경
    }

    // TODO : 1-9 numberPool 생성
    public void createNumberPool(){
        numberPool = new ArrayList<>();
        for(int i=1; i<10; i++){
            numberPool.add(i);
        }
    }

    // TODO : pool에서 뽑고 지우기 반복 방식
    public String createTargetNumber(int range){
        Random random = new Random();
        int randomIndex = random.nextInt(range);
        int targetNumber = numberPool.get(randomIndex);
        numberPool.remove(randomIndex);
        return Integer.toString(targetNumber);
    }

    // TODO : targetNumberList 생성
    public void makeTargetNumberList(int digit){
        for(int i=0; i<digit; i++){
            int range = numberPool.size() - 1;
            targetNumberList.add(i, createTargetNumber(range));
        }
    }



}
