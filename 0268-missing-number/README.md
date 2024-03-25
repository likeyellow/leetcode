<h2><a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">Given an array <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">nums</code> containing <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">n</code> distinct numbers in the range <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">[0, n]</code>, return <em data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">the only number in the range that is missing from the array.</em></p>

<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">&nbsp;</p>
<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><strong class="example" data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [3,0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
</pre>

<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><strong class="example" data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> 2
<strong>Explanation:</strong> n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
</pre>

<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><strong class="example" data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [9,6,4,2,3,5,7,0,1]
<strong>Output:</strong> 8
<strong>Explanation:</strong> n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
</pre>

<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">&nbsp;</p>
<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><strong data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">
	<li data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">n == nums.length</code></li>
	<li data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">1 &lt;= n &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52"><code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">0 &lt;= nums[i] &lt;= n</code></li>
	<li data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1">All the numbers of <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">nums</code> are <strong data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">unique</strong>.</li>
</ul>

<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">&nbsp;</p>
<p data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52" data-immersive-translate-paragraph="1"><strong data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">Follow up:</strong> Could you implement a solution using only <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">O(1)</code> extra space complexity and <code data-immersive-translate-walked="1f8f8899-8d92-4134-b681-e8d51ec8ff52">O(n)</code> runtime complexity?</p>
</div>