//import org.apache.commons.collections4.ListUtils;
//
//import java.util.List;
//
//public class testsplit {
//
//	@Test
//	public void givenList_whenParitioningIntoNSublists_thenCorrect() {
//		List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
//		List<List<Integer>> subSets = ListUtils.partition(intList, 3);
//
//		List<Integer> lastPartition = subSets.get(2);
//		List<Integer> expectedLastPartition = Lists.<Integer> newArrayList(7, 8);
//		assertThat(subSets.size(), equalTo(3));
//		assertThat(lastPartition, equalTo(expectedLastPartition));
//	}
//	
//}
