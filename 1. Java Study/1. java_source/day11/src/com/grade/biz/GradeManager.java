package com.grade.biz;

import com.grade.entity.CareerStudent;
import com.grade.entity.NewStudent;
import com.grade.entity.Student;

public class GradeManager implements IGradeManager {
	private Student[] students = new Student[30];
	private int cnt = 0;

	public GradeManager() {
		super();
		students[cnt++] = new NewStudent("10001", "kim", new int[] { 74, 70, 80 }, false);
		students[cnt++] = new NewStudent("10005", "park", new int[] { 90, 90, 100 }, false);
		students[cnt++] = new NewStudent("10009", "lee", new int[] { 70, 62, 60 }, true);
		students[cnt++] = new CareerStudent("20001", "han", new int[] { 96, 85, 93 }, 1);
		students[cnt++] = new CareerStudent("20005", "nam", new int[] { 90, 80, 73 }, 2);
		students[cnt++] = new CareerStudent("20009", "choi", new int[] { 70, 70, 90 }, 1);
	}

	@Override
	public void printStudents(int printType) {
		System.out.println("=============================================================================");
		System.out.println("���    �̸�  ����/��� ���Ͽ��� ��³��  C  Linux  Java  ���� ���  �հݿ���");
		System.out.println("=============================================================================");
		if (printType == IGradeManager.PRINT_ALL) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(students[i].getStudentNo() + " ");
				System.out.print(students[i].getStudentName() + " ");
				if (students[i] instanceof NewStudent) {
					System.out.print("���� " + (((NewStudent) students[i]).isInternYn() ? " Y      " : "  N     "));
				} else {
					System.out.print("���           " + ((CareerStudent) students[i]).getCareerYears());
				}
				System.out.print(students[i].toString());
				if (students[i].isPass()) {
					System.out.print("�հ�\n");
				} else {
					System.out.print("���հ�\n");
				}
			}
		} else if (printType == IGradeManager.PRINT_PASS) {
			for (int i = 0; i < cnt; i++) {
				if (students[i].isPass()) {
					System.out.print(students[i].getStudentNo() + " ");
					System.out.print(students[i].getStudentName() + " ");
					if (students[i] instanceof NewStudent) {
						System.out.print("���� " + (((NewStudent) students[i]).isInternYn() ? " Y      " : "  N     "));
					} else {
						System.out.print("���           " + ((CareerStudent) students[i]).getCareerYears());
					}
					System.out.print(students[i].toString());
					System.out.print("�հ�\n");
				}
			}
		} else if (printType == IGradeManager.PRINT_FAIL) {
			for (int i = 0; i < cnt; i++) {
				if (!students[i].isPass()) {
					System.out.print(students[i].getStudentNo() + " ");
					System.out.print(students[i].getStudentName() + " ");
					if (students[i] instanceof NewStudent) {
						System.out.print("���� " + (((NewStudent) students[i]).isInternYn() ? " Y      " : "  N     "));
					} else {
						System.out.print("���           " + ((CareerStudent) students[i]).getCareerYears());
					}
					System.out.print(students[i].toString());
					System.out.print("���հ�\n");
				}
			}

		}
		System.out.println("=============================================================================");
	}
}
