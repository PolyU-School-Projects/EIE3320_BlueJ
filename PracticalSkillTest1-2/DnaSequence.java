//Q2. WU Xiaotao 21097724D
//Tool: BlueJ

//Protein DNA begins with a start condon "ATG"
//Protein DNA ends with a stop condon "TGA"
//The length of Protein DNA is divisible by 3

public class DnaSequence {

    boolean isProteinDNA(String dna){
        if(dna.startsWith("ATG")&&(dna.endsWith("TGA"))&&(dna.length()%3 ==0)){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String s1dna = "ATGCGATACTGA";
        String s2dna = "ATGCGATTACGTGA";
        String s3dna = "ATTAATATGTACTGA";

        DnaSequence sample1 = new DnaSequence();
        System.out.print(sample1.isProteinDNA(s1dna) + " ");
        DnaSequence sample2 = new DnaSequence();
        System.out.print(sample2.isProteinDNA(s2dna) + " ");
        DnaSequence sample3 = new DnaSequence();
        System.out.print(sample3.isProteinDNA(s3dna));
    }
}