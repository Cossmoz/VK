package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int idFrom;
    private int idOwner;
    private int byCreate;
    private int idReplyOwner;
    private int idReplyPost;
    private int onlyFriends;
    private LikesInfo likesInfo;
    private ReportsInfo reportsInfo;
    private ViewsInfo viewsInfo;
    private String copyright;
    private String typePost;
    private int copyHistory;
    private int idSigner;
    private Geo geo;
    private boolean isFavorite;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canFix;
    private boolean canCopy;
    private int isPinned;
    private int markedAsAds;
    private int idOwnerGive;
    private int idOwnerLike;
    private int idPostponed;

}