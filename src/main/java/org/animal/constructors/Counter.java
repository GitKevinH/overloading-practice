package org.animal.constructors;

public class Counter {
    int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter(){
        this.startValue = 0;
    }
    public int value(){
        return startValue;
    }

    public void increase(){
        startValue++;
    }
    public void increase(int byValue){
        if(byValue > 0){
            startValue += byValue;
        }
    }

    public void decrease(){
        startValue--;
    }

    public void decrease(int byValue){
        if(byValue > 0){
            startValue -= byValue;
        }
    }


}
