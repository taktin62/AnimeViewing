--2022/06/20
--�S���擾_�T���v��
SELECT title, genre, author_id, publisher_id, magazine
	FROM animation_view.animations, animation_view.genre;

--�S���擾VER01
SELECT title, genre, author_id, publisher_id, name
	FROM animation_view.animations, animation_view.publish
		INNER JOIN animation_view.magazines ON animation_view.publish.magazine_id = animation_view.magazines.name;

----�S���擾VER02
SELECT title, genre, author_id, publisher_id, magazine_id
	FROM animation_view.animations, animation_view.publish
		INNER JOIN animation_view.publish ON animation_view.animations = animation_view.publish.publisher_id  
		INNER JOIN animation_view.magazines ON animation_view.publish.magazine_id = animation_view.magazines.magazine_id;