<h2><a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.</p>

<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">You must&nbsp;write an algorithm with&nbsp;<code data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">O(log n)</code> runtime complexity.</p>

<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">&nbsp;</p>
<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><strong class="example" data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,3,5,6], target = 5
<strong>Output:</strong> 2
</pre>

<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><strong class="example" data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,3,5,6], target = 2
<strong>Output:</strong> 1
</pre>

<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><strong class="example" data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,3,5,6], target = 7
<strong>Output:</strong> 4
</pre>

<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">&nbsp;</p>
<p data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><strong data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">
	<li data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><code data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><code data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">nums</code> contains <strong data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">distinct</strong> values sorted in <strong data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">ascending</strong> order.</li>
	<li data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e"><code data-immersive-translate-walked="12d80daa-ed58-4857-9d86-411b6d51bc4e">-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>
</div>