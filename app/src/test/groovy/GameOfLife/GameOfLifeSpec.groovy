package GameOfLife

import spock.lang.Specification

class GameOfLifeSpec extends Specification {
    def "can get center cell"() {
        when:
        GameOfLife game = new GameOfLife()
        then:
        game.getCenterCell() instanceof Cell
    }

    def "can initiate a starting"() {
        when:
        GameOfLife game = new GameOfLife()
        then:
        game.getCenterCell().cell4 = new Cell(isAlive: true)
        game.getCenterCell().cell8 = new Cell(isAlive: true)
    }

    def "we can initiate"() {
        when:
        GameOfLife game = new GameOfLife()
        then:
        game.getCenterCell().cell4 = new Cell(isAlive: true)
        game.getCenterCell().cell8 = new Cell(isAlive: true)
    }
}
