public class Stocks {
    public static void main(String[] args){
        int[] prices = {-1,-1,0,0,0,0,-2};
        int big = prices[0];
        int small = prices[0];
        int tamanho = prices.length;

        for (int posicao = 0; posicao < tamanho; posicao++){

            if(prices[posicao] > big){
                big = prices[posicao];
            }
            if (prices[posicao] < small){
                small = prices[posicao];
        };
    }
        System.out.println("Maior: " + big);
        System.out.println("Menor: " + small);
        System.out.println("Lucro: " + (big - small));
}
}

