package com.hectorlopezfernandez.utils;

import java.util.ArrayList;
import java.util.List;

import com.hectorlopezfernandez.model.ArchiveEntry;
import com.hectorlopezfernandez.model.Author;
import com.hectorlopezfernandez.model.Host;
import com.hectorlopezfernandez.model.Post;
import com.hectorlopezfernandez.model.Tag;

public final class Data {

	// no instanciable
	private Data() {};

	public static Host getPreferences() {
		Host h = new Host();
		h.setTagline("Un blog de prueba");
		h.setTitle("Prueba");
		return h;
	}

	public static Author getAuthor() {
		Author a = new Author();
		a.setUsername("hector");
		a.setAbout("Viendo pasar los bytes desde mi ventana");
		a.setDisplayName("Hector");
		a.setRelatedUrl("http://www.hectorlopezfernandez.com");
		return a;
	}
	
	public static ArchiveEntry getArchiveEntry() {
		ArchiveEntry ae = new ArchiveEntry();
		ae.setMonth(2);
		ae.setYear(2015);
		return ae;
	}

	public static Tag getTag() {
		Tag t = new Tag();
		t.setName("Filosofia");
		t.setNameUrl("filosofia");
		return t;
	}

	public static List<Tag> getTags() {
		List<Tag> tags = new ArrayList<Tag>(3);
		for (int i = 0; i < 3; i++) {
			tags.add(getTag());
		}
		return tags;
	}

	public static Post getPost() {
		Post p = new Post();
		p.setArchiveEntry(getArchiveEntry());
		p.setAuthor(getAuthor());
		p.setCommentsClosed(true);
		p.setContent("<p>Blabla</p>");
		p.setCreationDateAsLong(System.currentTimeMillis());
		p.setExcerpt("<p>Bla</p>");
		p.setHost(getPreferences());
		p.setLastModificationDateAsLong(System.currentTimeMillis());
		p.setMetaDescription("Blablablablablabla");
		p.setPublicationDateAsLong(System.currentTimeMillis());
		p.setTags(getTags());
		p.setTitle("Bla blabla blabla");
		p.setTitleUrl("bla");
		return p;
	}

	public static List<Post> getPosts() {
		List<Post> posts = new ArrayList<Post>(6);
		for (int i = 0; i < 6; i++) {
			posts.add(getPost());
		}
		return posts;
	}

}