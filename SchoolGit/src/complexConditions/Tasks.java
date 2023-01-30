package complexConditions;

class Tasks {
    private final String bel = "Point is belonging";
    private final String noBel = "Point isn't belonging";

    private int x;
    private int y;
    Tasks(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void pointIsBelongingB(){
        if (y <= -x){
            System.out.println(bel);
        }
        else
            System.out.println(noBel);
    }

    public void pointIsBelongingG(){
        if (Math.pow(x, 2) + Math.pow(y, 2) <= 2){
            System.out.println(bel);
        }
        else
            System.out.println(noBel);
    }

    public void pointIsBelongingSecondBFirst(){
        if (y <= 2 - Math.pow(x,2) && y >= x ){
            System.out.println(bel);
        }
        else System.out.println(noBel);
    }



}
