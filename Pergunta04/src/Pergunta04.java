public class Pergunta04 {
    public static void main(String[] args) throws Exception {

        float SP = 67836.43f;
        float RJ = 36678.66f;
        float MG = 29229.88f;
        float ES = 27165.48f;
        float OUTROS = 19849.53f;
        float TOTAL = (SP+RJ+MG+ES+OUTROS);
        System.out.println("Total: "+TOTAL);

        float percSP     = ((SP*TOTAL)/100);
        float percRJ     = ((RJ*TOTAL)/100);
        float percMG     = ((MG*TOTAL)/100);
        float percES     = ((ES*TOTAL)/100);
        float percOUTROS = ((OUTROS*TOTAL)/100);

        System.out.println("O percentual de SP é: " + percSP);
        System.out.println("O percentual de RJ é: " + percRJ);
        System.out.println("O percentual de MG é: " + percMG);
        System.out.println("O percentual de ES é: " + percES);
        System.out.println("O percentual de OUTROS é: " + percOUTROS);

    }
}