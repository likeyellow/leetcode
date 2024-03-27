<h2><a href="https://leetcode.com/problems/number-of-good-pairs/">1512. Number of Good Pairs</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">Given an array of integers <code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">nums</code>, return <em data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">the number of <strong data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">good pairs</strong></em>.</p>

<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">A pair <code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">(i, j)</code> is called <em data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">good</em> if <code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">nums[i] == nums[j]</code> and <code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">i</code> &lt; <code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">j</code>.</p>

<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">&nbsp;</p>
<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><strong class="example" data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,1,1,3]
<strong>Output:</strong> 4
<strong>Explanation:</strong> There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
</pre>

<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><strong class="example" data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,1,1,1]
<strong>Output:</strong> 6
<strong>Explanation:</strong> Each pair in the array are <em>good</em>.
</pre>

<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><strong class="example" data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 0
</pre>

<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">&nbsp;</p>
<p data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><strong data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">
	<li data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">1 &lt;= nums.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e"><code data-immersive-translate-walked="4bdd796e-f888-40a4-92d1-14348d0bbe1e">1 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>