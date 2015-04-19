package com.hectorlopezfernandez.model;

import java.util.Collection;

import org.joda.time.DateTime;

public class Post {

	private String title;
	private String titleUrl;
	private String metaDescription;
	private String excerpt;
	private String content;
	private long creationDateAsLong;
	private DateTime creationDate;
	private long publicationDateAsLong;
	private DateTime publicationDate;
	private long lastModificationDateAsLong;
	private DateTime lastModificationDate;
	private boolean commentsClosed;
	
	private Host host;
	private Author author;
	private ArchiveEntry archiveEntry;
	private Collection<Tag> tags;

	// getters y setters sinteticos

	public void setCreationDateAsLong(long creationDateAsLong) {
		this.creationDateAsLong = creationDateAsLong;
		this.creationDate = new DateTime(creationDateAsLong);
	}
	public void setCreationDate(DateTime creationDate) {
		if (creationDate == null) setCreationDateAsLong(0);
		else setCreationDateAsLong(creationDate.getMillis());
	}

	public void setPublicationDateAsLong(long publicationDateAsLong) {
		this.publicationDateAsLong = publicationDateAsLong;
		this.publicationDate = new DateTime(publicationDateAsLong);
	}
	public void setPublicationDate(DateTime publicationDate) {
		if (publicationDate == null) setPublicationDateAsLong(0);
		else setPublicationDateAsLong(publicationDate.getMillis());
	}
	
	public void setLastModificationDateAsLong(long lastModificationDateAsLong) {
		this.lastModificationDateAsLong = lastModificationDateAsLong;
		this.lastModificationDate = new DateTime(lastModificationDateAsLong);
	}
	public void setLastModificationDate(DateTime lastModificationDate) {
		if (lastModificationDate == null) setLastModificationDateAsLong(0);
		else setLastModificationDateAsLong(lastModificationDate.getMillis());
	}

	public int getYear() {
		return (publicationDate == null ? 0 : publicationDate.getYear());
	}
	public int getMonth() {
		return (publicationDate == null ? 1 : publicationDate.getMonthOfYear());
	}

	// getters & setters
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitleUrl() {
		return titleUrl;
	}
	public void setTitleUrl(String titleUrl) {
		this.titleUrl = titleUrl;
	}

	public String getExcerpt() {
		return excerpt;
	}
	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	public DateTime getCreationDate() {
		return creationDate;
	}
	public DateTime getPublicationDate() {
		return publicationDate;
	}
	public DateTime getLastModificationDate() {
		return lastModificationDate;
	}

	public long getCreationDateAsLong() {
		return creationDateAsLong;
	}
	public long getPublicationDateAsLong() {
		return publicationDateAsLong;
	}
	public long getLastModificationDateAsLong() {
		return lastModificationDateAsLong;
	}

	public boolean isCommentsClosed() {
		return commentsClosed;
	}
	public void setCommentsClosed(boolean commentsClosed) {
		this.commentsClosed = commentsClosed;
	}

	public ArchiveEntry getArchiveEntry() {
		return archiveEntry;
	}
	public void setArchiveEntry(ArchiveEntry archiveEntry) {
		this.archiveEntry = archiveEntry;
	}

	public Collection<Tag> getTags() {
		return tags;
	}
	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}

	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}

}