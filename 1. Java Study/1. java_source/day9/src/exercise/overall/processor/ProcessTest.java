package exercise.overall.processor;

public class ProcessTest {

	public static void main(String[] args) {
		Processor[] processors = new Processor[] {
				new LowerCase(),
				new UpperCase(),
				new Splitter()
		};
		String str = "I'm so sorry, but I love you, �� ������~~";
		process(processors, str);

	}
	private static void process(Processor[] processors, String s) {		
		for (Processor p : processors) {
			System.out.println("Processor �� : "+p.name());
			System.out.println("��� ��� : "+p.process(s));
		}
	}

}
