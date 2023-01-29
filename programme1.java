package Tp;
import java.util.*;

public class programme1 {

		public static void main(String[] args) {
			ArrayList<Etudiant>list = new ArrayList<Etudiant>();
			list.add(new Etudiant("MASENGO","BAC3","2020022220","20","MARIE"));
			list.add(new Etudiant("MUGENI","BAC3","2020022221","26","CELIBATEUR"));
			list.add(new Etudiant("NJIBA","BAC3","2020022222","21","FIANCE"));
			list.add(new Etudiant("KAPAPA","BAC3","2020022223","24","MARIE"));
			list.add(new Etudiant("KASONGO","BAC3","2020022224","20","CELIBATEUR"));
			list.add(new Etudiant("KAPINGA","BAC3","2020022225","26","CELIBATEUR"));
			list.add(new Etudiant("BANZA","BAC3","2020022226","29","CELIBATEUR"));
			list.add(new Etudiant("NGOIE","BAC3","2020022227","20","CELIBATEUR"));
			list.add(new Etudiant("KABONGO","BAC3","2020022228","26","MARIE"));
			list.add(new Etudiant("MATALA","BAC3","2020022229","24","MARIE")); 
			list.add(new Etudiant("KATUAL","BAC3","2020022230","22","CELIBATEUR"));
			list.add(new Etudiant("NGALULA","BAC3","2020022231","23","CELIBATEUR"));
			list.add(new Etudiant("KAJA","BAC3","2020022232","24","CELIBATEUR"));
			list.add(new Etudiant("MBAYA","BAC3","20200222233","26","CELIBATEUR"));
			list.add(new Etudiant("MAYANI","BAC3","2020022234","29","CELIBATEUR"));
			list.add(new Etudiant("TSHIDIBI","BAC3","2020022235","30","CELIBATEUR"));
			list.add(new Etudiant("KAYOMBO","BAC3","2020022236","29","CELIBATEUR"));
			list.add(new Etudiant("MBIYE","BAC3","2020022237","29","CELIBATEUR"));
			list.add(new Etudiant("KALALA","BAC3","2020022238","29","CELIBATEUR"));
			list.add(new Etudiant("ULOUNGA","BAC3","2020022239","29","CELIBATEUR"));
			list.add(new Etudiant("RAMASANI","BAC3","2020022240","29","CELIBATEUR"));
			list.add(new Etudiant("TAMBWE","BAC3","2020022241","29","CELIBATEUR"));
			list.add(new Etudiant("LUPEMBA","BAC3","2020022242","29","MARIE"));
			list.add(new Etudiant("MASIDA","BAC3","2020022243","29","MARIE"));
			list.add(new Etudiant("KABAYO","BAC3","2020022244","29","MARIE"));
			list.add(new Etudiant("AMISI","BAC3","2020022245","29","FIANCE"));
			list.add(new Etudiant("VOUMILIA","BAC3","2020022246","29","FIANCE"));
			list.add(new Etudiant("MONGA","BAC3","2020022247","29","FIANCE"));
			list.add(new Etudiant("KABANGU","BAC3","2020022248","29","DIVORCE"));
			list.add(new Etudiant("BUKASA","BAC3","2020022249","29","DIVORCE"));
			list.add(new Etudiant("LENGE","BAC3","2020022250","29","DIVORCE"));
		Scanner let= new Scanner(System.in);
			System.out.println("ENTRE MOT CLE");
			String rech = let.nextLine();
			for(Etudiant a: list) {
				if(a.getNom().contains(rech))
				System.out.println(a);
				
			}
		}
		}