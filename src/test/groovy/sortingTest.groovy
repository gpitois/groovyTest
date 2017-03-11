/**
 * Created by GP on 3/10/2017.
 */
class SorterTest extends GroovyTestCase {
    void testSortReversed() {
        def sorter = new Sorter()
        def testList = ['d', 'c', 'b', 'a']
        sorter.sortAlpha(testList)
        def expected = ['a', 'b', 'c', 'd']
        assertEquals(testList, expected)
    }
}