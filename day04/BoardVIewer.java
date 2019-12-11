package day04;

public class BoardVIewer {
	public void showList(BoardController boardcontroller,
			MemberController memberController, Scanner scan) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		ArrayList<BoardDTO> list = controller.selectAll();
		for(BoardDTO b : list) {
			System.out.println("==========================================");
			System.out.println("글번호\t제목\t작성자\t날짜");
			System.out.printf("%d\t%s\t%s\t%s\n",
					b.getId(),
					b.getTitle(),
					memberController.getWriter
		}
	}
}
