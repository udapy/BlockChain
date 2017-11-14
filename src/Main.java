import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

        String[] genesisTransactions = {"alice sent bob 1000 bitcoin","oscar sent 10 bitcoins to bob"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"charlie sent 2000 bitcoin to bob", "alice sent 10 bitcoin to T-mobile"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Tom sent 70 bitcoin to US bank"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }

}
