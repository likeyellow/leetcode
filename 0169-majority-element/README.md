<h2><a href="https://leetcode.com/problems/majority-element/">169. Majority Element</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1"><p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1">Given an array <code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">nums</code> of size <code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">n</code>, return <em data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">the majority element</em>.</p>

<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1">The majority element is the element that appears more than <code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">⌊n / 2⌋</code> times. You may assume that the majority element always exists in the array.</p>

<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">&nbsp;</p>
<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><strong class="example" data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [3,2,3]
<strong>Output:</strong> 3
</pre><p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><strong class="example" data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [2,2,1,1,1,2,2]
<strong>Output:</strong> 2
</pre>
<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">&nbsp;</p>
<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><strong data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">
	<li data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">n == nums.length</code></li>
	<li data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659"><code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>

<p data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">&nbsp;</p>
<strong data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">Follow-up:</strong> Could you solve the problem in linear time and in <code data-immersive-translate-walked="2e0d27df-cfd9-4dfa-8e76-ccbdf8a3b659">O(1)</code> space?</div>