<h2><a href="https://leetcode.com/problems/running-sum-of-1d-array/">1480. Running Sum of 1d Array</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Given an array <code data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">nums</code>. We define a running sum of an array as&nbsp;<code data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">runningSum[i] = sum(nums[0]…nums[i])</code>.</p>

<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Return the running sum of <code data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">nums</code>.</p>

<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">&nbsp;</p>
<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><strong class="example" data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> [1,3,6,10]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].</pre>

<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><strong class="example" data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,1,1,1,1]
<strong>Output:</strong> [1,2,3,4,5]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].</pre>

<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><strong class="example" data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [3,1,2,10,1]
<strong>Output:</strong> [3,4,6,16,17]
</pre>

<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">&nbsp;</p>
<p data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><strong data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">
	<li data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><code data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">1 &lt;= nums.length &lt;= 1000</code></li>
	<li data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad"><code data-immersive-translate-walked="eab0da56-0920-4e67-ab5d-6746529c68ad">-10^6&nbsp;&lt;= nums[i] &lt;=&nbsp;10^6</code></li>
</ul>
</div>