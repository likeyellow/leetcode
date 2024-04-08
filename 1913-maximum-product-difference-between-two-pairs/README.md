<h2><a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">1913. Maximum Product Difference Between Two Pairs</a></h2><h3>Easy</h3><hr><div data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">The <strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">product difference</strong> between two pairs <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(a, b)</code> and <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(c, d)</code> is defined as <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(a * b) - (c * d)</code>.</p>

<ul data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">
	<li data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">For example, the product difference between <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(5, 6)</code> and <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(2, 7)</code> is <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(5 * 6) - (2 * 7) = 16</code>.</li>
</ul>

<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">Given an integer array <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">nums</code>, choose four <strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">distinct</strong> indices <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">w</code>, <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">x</code>, <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">y</code>, and <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">z</code> such that the <strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">product difference</strong> between pairs <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(nums[w], nums[x])</code> and <code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">(nums[y], nums[z])</code> is <strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">maximized</strong>.</p>

<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">Return <em data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">the <strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">maximum</strong> such product difference</em>.</p>

<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">&nbsp;</p>
<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><strong class="example" data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [5,6,2,7,4]
<strong>Output:</strong> 34
<strong>Explanation:</strong> We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
</pre>

<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><strong class="example" data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [4,2,5,9,7,4,8]
<strong>Output:</strong> 64
<strong>Explanation:</strong> We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.
</pre>

<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">&nbsp;</p>
<p data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><strong data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f" data-immersive-translate-paragraph="1">Constraints:</strong></p>

<ul data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">
	<li data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">4 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f"><code data-immersive-translate-walked="76f9be1a-cbf9-49e0-9bae-b5537a3d183f">1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul></div>