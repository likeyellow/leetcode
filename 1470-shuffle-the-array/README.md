<h2><a href="https://leetcode.com/problems/shuffle-the-array/">1470. Shuffle the Array</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1">Given the array <code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">nums</code> consisting of <code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">2n</code> elements in the form <code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">[x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>,y<sub>1</sub>,y<sub>2</sub>,...,y<sub>n</sub>]</code>.</p>

<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1"><em data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">Return the array in the form</em> <code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">[x<sub>1</sub>,y<sub>1</sub>,x<sub>2</sub>,y<sub>2</sub>,...,x<sub>n</sub>,y<sub>n</sub>]</code>.</p>

<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">&nbsp;</p>
<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><strong class="example" data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,5,1,3,4,7], n = 3
<strong>Output:</strong> [2,3,5,4,1,7] 
<strong>Explanation:</strong> Since x<sub>1</sub>=2, x<sub>2</sub>=5, x<sub>3</sub>=1, y<sub>1</sub>=3, y<sub>2</sub>=4, y<sub>3</sub>=7 then the answer is [2,3,5,4,1,7].
</pre>

<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><strong class="example" data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,4,3,2,1], n = 4
<strong>Output:</strong> [1,4,2,3,3,2,4,1]
</pre>

<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><strong class="example" data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [1,1,2,2], n = 2
<strong>Output:</strong> [1,2,1,2]
</pre>

<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">&nbsp;</p>
<p data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><strong data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">
	<li data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">1 &lt;= n &lt;= 500</code></li>
	<li data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">nums.length == 2n</code></li>
	<li data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6"><code data-immersive-translate-walked="549dc137-3331-4535-89ac-81923739b8d6">1 &lt;= nums[i] &lt;= 10^3</code></li>
</ul></div>