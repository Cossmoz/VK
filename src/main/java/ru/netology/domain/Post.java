package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private Likes likes;
    private Share shareInfo;
    private Views views;
    private String typePost;
    private int idUser;
    private int idUserShare;
    private int idUserLike;
    private boolean canFix;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canCopy;
}
