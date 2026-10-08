public class hatakeKakashi
{
    public iChakra iChakra;

    public void setiChakra(iChakra iChakra) {
        this.iChakra = iChakra;
    }

    public void selectedChakraNature(){
        String status = iChakra.selectedChakraNature();
        System.out.println(status);
    }

}