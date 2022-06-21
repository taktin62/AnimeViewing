--2022/6/21　INSERT文作成
--genreテーブル
INSERT INTO animation_view.genre (label) VALUES
	('少年漫画');

--authorsテーブル
INSERT INTO animation_view.authors (name) VALUES
	('吾峠呼世晴');

--publishersテーブル
INSERT INTO animation_view.publishers (name) VALUES
	('集英社');

--animationsテーブル
INSERT INTO animation_view.animations (title, genre, author_id, publisher_id) VALUES
	('鬼滅の刃', '少年漫画', 1, 1);

--magazinesテーブル
INSERT INTO animation_view.magazines (magazine_id, publisher_id, name) VALUES
	(1, 1, '週刊少年ジャンプ');

--publishテーブル
INSERT INTO animation_view.publish (animation_id, magazine_id) VALUES
	(1, 1);
