BEGIN;

CREATE SCHEMA animation_view;


--genreテーブルの作成
CREATE TABLE animation_view.genre (
  label TEXT PRIMARY KEY);

COMMENT ON TABLE animation_view.genre IS 'ジャンルテーブル';
COMMENT ON COLUMN animation_view.genre.label IS 'ラベル';


--authorsテーブルの作成
CREATE TABLE animation_view.authors (
  author_id SERIAL PRIMARY KEY,
  name TEXT NOT NULL);

COMMENT ON TABLE animation_view.authors IS '著者テーブル';
COMMENT ON COLUMN animation_view.authors.author_id IS '著者ID';
COMMENT ON COLUMN animation_view.authors.name IS '著者';


--publishersテーブルの作成
CREATE TABLE animation_view.publishers (
  publisher_id SERIAL PRIMARY KEY,
  name TEXT NOT NULL);

COMMENT ON TABLE animation_view.publishers IS '出版社テーブル';
COMMENT ON COLUMN animation_view.publishers.publisher_id IS '出版社ID';
COMMENT ON COLUMN animation_view.publishers.name IS '出版社';


--animationsテーブルの作成
CREATE TABLE animation_view.animations (
  animation_id SERIAL PRIMARY KEY,
  title TEXT NOT NULL,
  genre TEXT NOT NULL REFERENCES animation_view.genre (label),
  author_id INTEGER NOT NULL REFERENCES animation_view.authors (author_id),
  publisher_id INTEGER NOT NULL REFERENCES animation_view.publishers (publisher_id));

COMMENT ON TABLE animation_view.animations IS 'アニメーションテーブル';
COMMENT ON COLUMN animation_view.animations.animation_id IS 'アニメーションID';
COMMENT ON COLUMN animation_view.animations.title IS 'タイトル';
COMMENT ON COLUMN animation_view.animations.genre IS 'ジャンル';
COMMENT ON COLUMN animation_view.animations.author_id IS '著者ID';
COMMENT ON COLUMN animation_view.animations.publisher_id IS '出版社ID';


--magazinesテーブルの作成
CREATE TABLE animation_view.magazines (
   magazine_id SERIAL PRIMARY KEY,
   publisher_id INTEGER NOT NULL REFERENCES animation_view.publishers (publisher_id),
   name TEXT NOT NULL);

COMMENT ON TABLE animation_view.magazines IS '掲載誌テーブル';
COMMENT ON COLUMN animation_view.magazines.magazine_id IS '掲載誌ID';
COMMENT ON COLUMN animation_view.magazines.publisher_id IS '出版社ID';
COMMENT ON COLUMN animation_view.magazines.name IS '掲載誌';


--publishテーブルの作成
CREATE TABLE animation_view.publish (
   animation_id INTEGER NOT NULL REFERENCES animation_view.animations (animation_id),
   magazine_id INTEGER NOT NULL REFERENCES animation_view.magazines (magazine_id));

COMMENT ON TABLE animation_view.publish IS '掲載テーブル';
COMMENT ON COLUMN animation_view.publish.animation_id IS 'アニメーションID';
COMMENT ON COLUMN animation_view.publish.magazine_id IS '掲載誌ID';

--ROLLBACK;
COMMIT;