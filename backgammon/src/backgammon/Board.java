package backgammon;
import java.util.*;

public class Board {

	ArrayList<Point> points;
	ArrayList<Checker> checkers;
	ArrayList<Checker> barRed;
	ArrayList<Checker> barWhite;
	ArrayList<Checker> offRed;
	ArrayList<Checker> offWhite;

	public Board() {

		points = new ArrayList<Point>();
		barRed = new ArrayList<Checker>();
		barWhite = new ArrayList<Checker>();
		offRed = new ArrayList<Checker>();
		offWhite = new ArrayList<Checker>();

		for (int i = 1; i <= 24; i++) {
			if (i <= 6) {
				points.add(new Point(i, 1));
			} else if (i > 6 && i <= 12) {
				points.add(new Point(i, 2));
			} else if (i > 12 && i <= 18) {
				points.add(new Point(i, 3));
			} else {
				points.add(new Point(i, 4));
			}
		}
		checkers = new ArrayList<>(30);
		for (int j = 1; j <= 30; j++) {
			if (j <= 15) {
				checkers.add(new Checker(true));
			} else {
				checkers.add(new Checker(false));
			}
		}
	}

	public void setUp() {
		for (int k = 0; k < 30; k++) {
			if (k <= 4) {
				points.get(11).addChecker(checkers.get(k));
			} else if (k > 4 && k <= 6) {
				points.get(0).addChecker(checkers.get(k));
			} else if (k > 6 && k <= 11) {
				points.get(18).addChecker(checkers.get(k));
			} else if (k > 11 && k <= 14) {
				points.get(16).addChecker(checkers.get(k));
			} else if (k > 14 && k <= 19) {
				points.get(5).addChecker(checkers.get(k));
			} else if (k > 19 && k <= 22) {
				points.get(7).addChecker(checkers.get(k));
			} else if (k > 22 && k <= 27) {
				points.get(12).addChecker(checkers.get(k));
			} else {
				points.get(23).addChecker(checkers.get(k));
			}
		}
	}

	public void printBoard() {

		StringBuilder s = new StringBuilder();
		// print first section
		s.append("\n12\t11\t10\t9\t8\t7\tBAR\t6\t5\t4\t3\t2\t1\tOFF\n");
		s.append("|\t|\t|\t|\t|\t|\t| |\t|\t|\t|\t|\t|\t|\t| |\n");
		int x = getMaxSize() + 1;
		s.append(printSectionOne(x));

		// print second section
		s.append(printSectionTwo(x));
		s.append("|\t|\t|\t|\t|\t|\t| |\t|\t|\t|\t|\t|\t|\t| |\n");
		s.append("13\t14\t15\t16\t17\t18\tBAR\t19\t20\t21\t22\t23\t24\tOFF\n");
		System.out.print(s);

	}

	public StringBuilder printSectionOne(int n) {
        StringBuilder s1 = new StringBuilder();
        for (int m = 0; m < n; m++) {
            for (int l = 12 - 1; l >= 6; l--) {
                if (points.get(l).isEmpty()) {
                    s1.append(" ");
                } else if (points.get(l).getSize() > m) {
                    s1.append(points.get(l).pointToString(m) + " ");
                } else {
                    s1.append(" ");
                }
                s1.append("\t");
            }
            //Upper Bar
            if (barRed != null && barRed.size() > m) {
                s1.append(" " + barRed.get(m).getDisplayString() + " \t");
            } else {
                s1.append("| |\t");
            }

            for (int l = 6 - 1; l >= 0; l--) {
                if (points.get(l).isEmpty()) {
                    s1.append(" ");
                } else if (points.get(l).getSize() > m) {
                    s1.append(points.get(l).pointToString(m));
                } else {
                    s1.append(" ");
                }
                s1.append("\t");
            }
            //Upper Off
            if (offRed != null && offRed.size() > m) {
                s1.append(" " + offRed.get(m).getDisplayString() + "\n");
            } else {
                s1.append("| |\n");
            }
        }
        return s1;
    }

    public StringBuilder printSectionTwo(int n) {
        StringBuilder s2 = new StringBuilder();
        for (int m = n - 1; m >= 0; m--) {
            for (int l = 12; l < 18; l++) {
                if (points.get(l).isEmpty()) {
                    s2.append(" ");
                } else if (points.get(l).getSize() > m) {
                    s2.append(points.get(l).pointToString(m) + " ");
                } else {
                    s2.append(" ");
                }
                s2.append("\t");
            }
            //Lower Bar
            if (barWhite != null && barWhite.size() > m) {
                s2.append(" " + barWhite.get(m).getDisplayString() + " \t");
            } else {
                s2.append("| |\t");
            }

            for (int l = 18; l < 24; l++) {
                if (points.get(l).isEmpty()) {
                    s2.append(" ");
                } else if (points.get(l).getSize() > m) {
                    s2.append(points.get(l).pointToString(m));
                } else {
                    s2.append(" ");
                }
                s2.append("\t");
            }
            //Lower Bar
            if (offWhite != null && offWhite.size() > m) {
                s2.append(" " + offWhite.get(m).getDisplayString() + "\n");
            } else {
                s2.append("| |\n");
            }
        }
        return s2;
    }


	public int getMaxSize() {
		int maxSize = -1;
		for (Point point : points) {
			if (point.getSize() > maxSize) {
				maxSize = point.getSize();
			}
		}
		return maxSize;
	}

	public ArrayList<Point> getPointsByColor(boolean isWhite) {
		ArrayList<Point> p = new ArrayList<>();

		for (Point point : points) {
			Checker c = point.getLastChecker();
			if (c != null && c.getColor() == isWhite) {
				p.add(point);
			}
		}
		return p;
	}

	public ArrayList<Path> getPathByColor(boolean isWhite, int dice) {
		ArrayList<Point> p = getPointsByColor(isWhite);
		ArrayList<Path> paths = new ArrayList<>();

		ArrayList<Checker> bar = isWhite ? barWhite : barRed;
		if (bar.size() > 0) {
			Point end = getPointByNumber(dice);
			Path path = new Path(null, end, isWhite);
			paths.add(path);
			return paths;
		}

		int dir = isWhite ? 1 : -1;
		for (Point point : p) {
			int nextNumber = point.number + dir * dice;
			Point end = getPointByNumber(nextNumber);
			if (end != null && end.getSize() == 1 && end.getLastChecker().color != isWhite) {
				Path path = new Path(point, end, isWhite);
				paths.add(path);
				continue;
			}
			if (end != null && end.getLastChecker() != null && end.getLastChecker().color != isWhite) {
				continue;
			}
			Path path = new Path(point, end, isWhite);
			paths.add(path);
		}
		return paths;
	}

	public void moveCheckerToBar(Point start, Point end, boolean isWhite) {
		if (start == null) {

			Checker last = end.getLastChecker();
			if (last.getColor() != isWhite) {
				ArrayList<Checker> otherBar = !isWhite ? barWhite : barRed;
				otherBar.add(end.checkerList.get(0));
				end.checkerList.remove(0);
			}

			ArrayList<Checker> bar = isWhite ? barWhite : barRed;
			Checker checker = bar.get(0);
			bar.remove(0);
			end.addChecker(checker);

		} else {

			ArrayList<Checker> otherBar = !isWhite ? barWhite : barRed;
			otherBar.add(end.checkerList.get(0));

			end.checkerList.remove(0);
			end.addChecker(start.getLastChecker());
			start.checkerList.remove(start.getSize() - 1);
			for (Point point : points) {
				if (point.getNumber() == start.getNumber()) {
					point = start;
				} else if (point.getNumber() == end.getNumber()) {
					point = end;
				}
			}
		}
	}

	public Point getPointByNumber(int number) {
		for (Point point : points) {
			if (point.number == number)
				return point;
		}
		return null;
	}

	/*public boolean checkWin(boolean isWhite) {
		return isWhite ? offWhite.size() == 15 : offRed.size() == 15;
	}*/
	
	public int checkWin() {
		if (offWhite.size() == 15) {
			return 1;
		}
		else if (offRed.size() == 15) {
			return 2;
		}
		else {
			return 0;
		}
	}

	public void moveChecker(Point start, Point end, boolean isWhite) {
		if (start == null) {
			ArrayList<Checker> bar = isWhite ? barWhite : barRed;
			Checker checker = bar.get(0);
			bar.remove(0);
			end.addChecker(checker);
		} else {
			end.addChecker(start.getLastChecker());
			start.checkerList.remove(start.getSize() - 1);
			for (Point point : points) {
				if (point.getNumber() == start.getNumber()) {
					point = start;
				} else if (point.getNumber() == end.getNumber()) {
					point = end;
				}
			}
		}
	}

	public ArrayList<Checker> moveCheckerToOff(Point start, boolean isWhite) {
		if (!isWhite) {
			offRed.add(start.getLastChecker());
			return offRed;
		} else {
			offWhite.add(start.getLastChecker());
			return offWhite;
		}

	}

	public ArrayList<Point> updateMoveToOff(Point start) {
		start.checkerList.remove(start.getSize() - 1);
		for (Point point : points) {
			if (point.getNumber() == start.getNumber()) {
				point = start;
			}
		}
		return points;
	}

	public void displayPipCount() {
		int pip1 = 0;
		ArrayList<Point> whitePoints = getPointsByColor(true);
		for (Point p : whitePoints) {
			int ind = p.getNumber();
			pip1 = pip1 + (25 - ind) * p.getSize();
		}
		int pip2 = 0;
		ArrayList<Point> redPoints = getPointsByColor(false);
		for (Point p : redPoints) {
			int ind = p.getNumber();
			pip2 = pip2 + ind * p.getSize();
		}
		System.out.println("Pipcounts. White: " + pip1 + ", Red: " + pip2);

	}
	
	public void displayStats(int doublingCube, int matchLength) {
		System.out.println("\nMatch score:\n" + doublingCube + "\nMatch length: " + (matchLength/2) + "\n");
	}

}
