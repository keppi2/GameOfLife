package GameOfLife

import java.util.stream.IntStream

class Cell {
    //cells are enumerated from 1 to 8 (clock wise from top left)
    Cell cell1
    Cell cell2
    Cell cell3
    Cell cell4
    Cell cell5
    Cell cell6
    Cell cell7
    Cell cell8
    boolean isAlive = false

    boolean isAlive() {
        isAlive
    }

    boolean getNextState() {
        int alive = IntStream.range(1, 9)
                .mapToObj{(Cell)this."cell$it"}
                .filter{it != null && it.isAlive}
                .count()

        if(isAlive && (alive == 2 || alive == 3))
            return true

        if(alive == 3)
            return true

        return false
    }

    void addNeighbour(int pos, Cell cell) {
        this."cell$pos" = cell
    }
}
