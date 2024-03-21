<h2><a href="https://leetcode.com/problems/plus-one/">66. Plus One</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><p data-immersive-translate-paragraph="1" data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">You are given a <strong data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">large integer</strong> represented as an integer array <code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">digits</code>, where each <code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">digits[i]</code> is the <code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">i<sup>th</sup></code> digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading <code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">0</code>'s.</p>

<p data-immersive-translate-paragraph="1" data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">Increment the large integer by one and return <em data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">the resulting array of digits</em>.</p>

<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">&nbsp;</p>
<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><strong class="example" data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> digits = [1,2,3]
<strong>Output:</strong> [1,2,4]
<strong>Explanation:</strong> The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
</pre>

<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><strong class="example" data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> digits = [4,3,2,1]
<strong>Output:</strong> [4,3,2,2]
<strong>Explanation:</strong> The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
</pre>

<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><strong class="example" data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> digits = [9]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
</pre>

<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">&nbsp;</p>
<p data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><strong data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">
	<li data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">1 &lt;= digits.length &lt;= 100</code></li>
	<li data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35"><code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">0 &lt;= digits[i] &lt;= 9</code></li>
	<li data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35" data-immersive-translate-paragraph="1"><code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">digits</code> does not contain any leading <code data-immersive-translate-walked="ed3482a7-7767-4647-a3de-c747d96f1c35">0</code>'s.</li>
</ul>
</div>