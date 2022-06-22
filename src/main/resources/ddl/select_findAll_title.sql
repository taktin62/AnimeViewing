--2022/06/20
--全件取得サンプル
SELECT title, genre, author_id, publisher_id, magazine
	FROM animation_view.animations, animation_view.genre;

--全件取得VER01
SELECT title, genre, author_id, publisher_id, name
	FROM animation_view.animations, animation_view.publish
		INNER JOIN animation_view.magazines ON animation_view.publish.magazine_id = animation_view.magazines.name;

--全件取得VER02
SELECT title, genre, author_id, publisher_id, magazine_id
	FROM animation_view.animations, animation_view.publish
		INNER JOIN animation_view.publish ON animation_view.animations.publisher_id = animation_view.publish.publisher_id
		INNER JOIN animation_view.magazines ON animation_view.publish.magazine_id = animation_view.magazines.magazine_id;

--全件取得VER03
SELECT title, genre, author_id, publisher_id, magazine_id
	FROM Aanimation_view.animations, animation_view.publish
		INNER JOIN animation_view.authors ON animation_view.animations.author_id = animation_view.authors.author_id
		INNER JOIN animation_view.publishers ON animation_view.animations.publisher_id = animation_view.publishers.publisher_id
		INNER JOIN animation_view.magazines ON animation_view.publish.magazine_id = animation_view.magazines.magazine_id;

--全件取得VER04 2022/6/21
SELECT a.title, a.genre, a.author_id, a.publisher_id, m.magazine_id
	FROM animation_view.animations a, animation_view.publish p
		INNER JOIN animation_view.magazines m ON p.magazine_id = m.magazine_id;

--全件取得VER05
SELECT a.title, a.genre, a.author_id, a.publisher_id, m.name
	FROM animation_view.animations a, animation_view.publish p
		INNER JOIN animation_view.magazines m ON p.magazine_id = m.magazine_id;

--全件取得VER06-1 2022/6/22 アニメ化されていて漫画化されている
SELECT a.title, a.genre, t.name, ps.name, m.name
	FROM animation_view.animations a
		INNER JOIN animation_view.publish p ON a.animation_id = p.animation_id
		INNER JOIN animation_view.authors t ON a.author_id = t.author_id
		INNER JOIN animation_view.publishers ps ON a.publisher_id = ps.publisher_id
		INNER JOIN animation_view.magazines m ON p.magazine_id = m.magazine_id;

--全件取得VER06-2 2022/6/22 アニメ化されていて漫画化されていないものまたは、アニメ化されていて漫画化されている
SELECT a.title, a.genre, t.name, ps.name, m.name
	FROM animation_view.animations a
		LEFT JOIN animation_view.publish p ON a.animation_id = p.animation_id
		LEFT JOIN animation_view.magazines m ON p.magazine_id = m.magazine_id
		INNER JOIN animation_view.authors t ON a.author_id = t.author_id
		INNER JOIN animation_view.publishers ps ON a.publisher_id = ps.publisher_id;
