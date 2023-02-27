package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

	// Normal fakt string cut karat jato
	static void subSeq(String temp, String str) {
		if (str.length() == 0) {
			System.out.println(temp);
			return;
		}
		subSeq(temp + str.charAt(0), str.substring(1));
		subSeq(temp, str.substring(1));
	}

	// ARraylist return
	static ArrayList<String> subSeq2(String temp, String str, ArrayList<String> list) {
		if (str.length() == 0) {
			list.add(temp);
			return list;
		}
		subSeq2(temp + str.charAt(0), str.substring(1), list);
		subSeq2(temp, str.substring(1), list);
		return list;
	}

	static List<List<Integer>> SubArray(int arr[]) {
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		ArrayList<Integer> list = new ArrayList<>();
		outer.add(list);

		// Each element of array should be added in the each element present inside the
		// previous list;

		for (int num : arr) {
			// Taken Size here because we are adding elments in the loop
			int size = outer.size();

			// Adding each element of array in previous lists.

			for (int i = 0; i < size; i++) {
				ArrayList<Integer> internal = new ArrayList<>();
				internal.addAll(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}

		return outer;

	}

	static void permutations(String temp, String str) {
		if (str.length() == 0) {
			System.out.println(temp);
			return;
		}
		// Taken the character ;
		char ch = str.charAt(0);

		// Each time the no of recursions we have to made are = size of temp + 1;
		// The character can be add at 3 pos eg
		// AB & /C rem.
		// _AB A_B AB_ = CAB ACB ABC
		for (int i = 0; i <= temp.length(); i++) {
			String first = temp.substring(0, i);
			String second = temp.substring(i);
			permutations(first + ch + second, str.substring(1));
		}
	}

	static ArrayList<String> permutations2(String temp, String str, ArrayList<String> list) {
		if (str.length() == 0) {
			list.add(temp);
			return list;
		}
		char ch = str.charAt(0);
		for (int i = 0; i <= temp.length(); i++) {
			String first = temp.substring(0, i);
			String second = temp.substring(i);
			permutations(first + ch + second, str.substring(1));
		}
		return list;
	}

	// LeetCode
	// https://leetcode.com/problems/permutation-in-string/
	// Given two strings s1 and s2, return true if s2 contains a permutation of s1,
	// or false otherwise.
	// In other words, return true if one of s1's permutations is the substring of
	// s2.

	public boolean checkInclusion(String s1, String s2) {
		List<String> op = chkPermPresent("", s1, new ArrayList());
		for (int i = 0, j = op.size() - 1; i <= j; i++, j--) {
			if (s2.contains(op.get(i)) || s2.contains(op.get(j)))
				return true;
		}
		return false;
	}

	List<String> chkPermPresent(String temp, String str, ArrayList<String> list) {
		if (str.length() == 0) {
			list.add(temp);
			return list;
		}

		char ch = str.charAt(0);
		for (int i = 0; i <= temp.length(); i++) {
			String first = temp.substring(0, i);
			String secons = temp.substring(i);
			chkPermPresent(first + ch + secons, str.substring(1), list);
		}
		return list;

	}

	// LeetCode
	// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	// Given two strings s and p, return an array of all the start indices of p's
	// anagrams in s.
	// You may return the answer in any order.
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		char arr1[] = p.toCharArray();
		Arrays.sort(arr1);
		for (int i = 0; i < s.length() - (p.length() - 1); i++) {
			char arr2[] = s.substring(i, i + p.length()).toCharArray();
			Arrays.sort(arr2);
			if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
				list.add(i);
			}

		}
		return list;
	}

	// LeetCode https://leetcode.com/problems/longest-palindromic-subsequence/
	// Given a string s, find the longest palindromic subsequence's length in s.
	public int longestPalindromeSubseq(String s) {
		int max = -1;

		for (String str : (List<String>) subSeq2("", s, new ArrayList())) {
			if (chkPali(str) && str.length() > max) {
				max = str.length();
			}
		}
		return max;
	}

	boolean chkPali(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}

	// LeetCode https://leetcode.com/problems/longest-common-subsequence/description/
	// Longest Common SubSequence from two Strings
	public int longestCommonSubsequence(String text1, String text2) {

		int max = 0;
		List<String> first = subSeq2("", text1, new ArrayList());
		List<String> second = subSeq2("", text2, new ArrayList());
		
		for(String s:first)
		{
			if(second.toString().contains(s)&&s.length()>max)
				max=s.length();
		}
		return max;

	}

	public static void main(String[] args) {

		System.out.println("---------Printing the subsequences of strings-----------");
		subSeq("", "ABC");

		System.out.println("---------Arraylist the subsequences of strings-----------");
		ArrayList<String> list1 = subSeq2("", "ABC", new ArrayList<String>());
		for (String string : list1) {
			System.out.println(string);
		}

		System.out.println("---------Printing the Sub Arrays -----------");
		int arr[] = { 1, 2, 3 };
		System.out.println(SubArray(arr));

		System.out.println("---------Printing the Permutations of strings-----------");
		permutations("", "ABC");

		System.out.println("---------Printing the Permutations of strings-----------");
		ArrayList<String> list2 = permutations2("", "ABC", new ArrayList<>());
		for (String string : list2) {
			System.out.println(string);
		}

	}
}
