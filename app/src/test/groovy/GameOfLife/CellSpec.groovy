package GameOfLife

import spock.lang.Specification

class CellSpec extends Specification {

    def "cell is default not alive"() {
        when:
        Cell cell = new Cell()

        then:
        !cell.isAlive()
    }

    def "cell has a state"() {
        when:
        Cell cell = new Cell(isAlive: true)

        then:
        cell.isAlive()
    }

    def "rule1: given no neighbors when nextState then not alive anymore"() {
        when:
        Cell cell = new Cell(isAlive: true)

        then:
        !cell.getNextState()
    }

    def "rule2: given alive cell and two neighbors when nextState then still alive"() {
        when:
        Cell cell = new Cell(isAlive: true)
        cell.addNeighbour(1, new Cell(isAlive: true))
        cell.addNeighbour(2, new Cell(isAlive: true))

        then:
        cell.getNextState()
    }

    def "rule2: given not alive cell and two neighbors when nextState then still not alive"() {
        when:
        Cell cell = new Cell(isAlive: false)
        cell.addNeighbour(1, new Cell(isAlive: true))
        cell.addNeighbour(2, new Cell(isAlive: true))

        then:
        !cell.getNextState()
    }

    def "rule3: given 4 alive neighbours when nextState then dead"() {
        when:
        Cell cell = new Cell(isAlive: true)
        cell.addNeighbour(1, new Cell(isAlive: true))
        cell.addNeighbour(2, new Cell(isAlive: true))
        cell.addNeighbour(3, new Cell(isAlive: true))
        cell.addNeighbour(4, new Cell(isAlive: true))

        then:
        !cell.getNextState()
    }

    def "rule4: given 3 alive neighbours when nextState then alive"() {
        when:
        Cell cell = new Cell(isAlive: false)
        cell.addNeighbour(1, new Cell(isAlive: true))
        cell.addNeighbour(2, new Cell(isAlive: true))
        cell.addNeighbour(3, new Cell(isAlive: true))

        then:
        cell.getNextState()
    }
}
