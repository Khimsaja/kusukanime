package com.kusukanime.data;

import O3.C;
import P3.q;
import P3.r;
import U3.c;
import U3.e;
import a6.C0673c;
import a6.l;
import a6.v;
import android.content.Context;
import f.AbstractC0847h;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.auth.AuthKt;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.auth.user.UserSession;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.PostgrestKt;
import io.github.jan.supabase.postgrest.UtilsKt;
import io.github.jan.supabase.postgrest.executor.RestRequestExecutor;
import io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder;
import io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder;
import io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder;
import io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder;
import io.github.jan.supabase.postgrest.request.DeleteRequest;
import io.github.jan.supabase.postgrest.request.InsertRequest;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import l4.C1447z;
import n6.d;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rJ.\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001f\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\tJN\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010,\u001a\u0004\u0018\u00010!H\u0086@¢\u0006\u0002\u0010\tJ(\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010/J\"\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0086@¢\u0006\u0002\u00103J4\u00104\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u00105\u001a\u00020\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u00107J&\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010<J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rJ\u001e\u0010@\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010B¨\u0006C"}, d2 = {"Lcom/kusukanime/data/UserRepo;", "", "<init>", "()V", "uid", "", "bookmarks", "", "Lcom/kusukanime/data/BookmarkRow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addBookmark", "", "slug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delBookmark", "saveHistory", "animeSlug", "episodeSlug", "posMs", "", "durMs", "(Ljava/lang/String;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addExp", "Lkotlin/Triple;", "", "", "amount", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "history", "Lcom/kusukanime/data/HistoryRow;", "limit", "clearHistory", "updateProfile", "Lcom/kusukanime/data/ProfileRow;", "ctx", "Landroid/content/Context;", ContentDisposition.Parameters.Name, "bio", "avatarBytes", "", "avatarMime", "username", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUsername", "profile", "comments", "Lcom/kusukanime/data/CommentRow;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commentLikes", "Lcom/kusukanime/data/LikeRow;", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addComment", "content", "parentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleLike", "targetType", "targetId", "like", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "episodeVoteStats", "Lcom/kusukanime/data/EpisodeVoteStats;", "episode", "voteEpisode", "value", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserRepo {
    public static final int $stable = 0;

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {262, 429, 273}, m = "addComment", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$addComment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.addComment(null, null, null, null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {67}, m = "addExp", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$addExp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07551 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C07551(S3.c<? super C07551> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.addExp(0, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {416}, m = "bookmarks", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$bookmarks$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07561 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07561(S3.c<? super C07561> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.bookmarks(this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {410}, m = "clearHistory", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$clearHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07571 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07571(S3.c<? super C07571> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.clearHistory(this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {416}, m = "commentLikes", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$commentLikes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07581 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C07581(S3.c<? super C07581> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.commentLikes(null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {416}, m = "comments", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$comments$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07591 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C07591(S3.c<? super C07591> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.comments(null, null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {303}, m = "episodeVoteStats", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$episodeVoteStats$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07601 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07601(S3.c<? super C07601> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.episodeVoteStats(null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {416}, m = "history", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$history$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07611 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07611(S3.c<? super C07611> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.history(0, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {416, 455, 474}, m = "profile", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$profile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07621 extends c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C07621(S3.c<? super C07621> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.profile(this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {423, 62}, m = "saveHistory", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$saveHistory$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07631 extends c {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C07631(S3.c<? super C07631> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.saveHistory(null, null, 0L, 0L, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {171}, m = "setUsername", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$setUsername$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07641 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07641(S3.c<? super C07641> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.setUsername(null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {132, 420, 438}, m = "updateProfile", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$updateProfile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07651 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C07651(S3.c<? super C07651> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.updateProfile(null, null, null, null, null, null, this);
        }
    }

    @e(c = "com.kusukanime.data.UserRepo", f = "UserRepo.kt", l = {310}, m = "voteEpisode", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.kusukanime.data.UserRepo$voteEpisode$1, reason: invalid class name and case insensitive filesystem */
    public static final class C07661 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07661(S3.c<? super C07661> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UserRepo.this.voteEpisode(null, 0, this);
        }
    }

    public static /* synthetic */ Object addComment$default(UserRepo userRepo, String str, String str2, String str3, String str4, S3.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            str4 = null;
        }
        return userRepo.addComment(str, str2, str3, str4, cVar);
    }

    public static /* synthetic */ Object comments$default(UserRepo userRepo, String str, String str2, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        return userRepo.comments(str, str2, cVar);
    }

    public static /* synthetic */ Object history$default(UserRepo userRepo, int i7, S3.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 50;
        }
        return userRepo.history(i7, cVar);
    }

    private final String uid() {
        UserInfo userInfoCurrentUserOrNull;
        UserSession userSessionCurrentSessionOrNull;
        UserInfo user;
        Auth auth = AuthKt.getAuth(SbClient.INSTANCE.get());
        try {
            userSessionCurrentSessionOrNull = auth.currentSessionOrNull();
        } catch (Throwable unused) {
        }
        String id = (userSessionCurrentSessionOrNull == null || (user = userSessionCurrentSessionOrNull.getUser()) == null) ? null : user.getId();
        if (id != null && !AbstractC2510o.g0(id)) {
            return id;
        }
        try {
            userInfoCurrentUserOrNull = auth.currentUserOrNull();
        } catch (Throwable unused2) {
        }
        String id2 = userInfoCurrentUserOrNull != null ? userInfoCurrentUserOrNull.getId() : null;
        if (id2 != null) {
            String str = AbstractC2510o.g0(id2) ? null : id2;
            if (str != null) {
                return str;
            }
        }
        throw new IllegalStateException("Belum login");
    }

    public static /* synthetic */ Object updateProfile$default(UserRepo userRepo, Context context, String str, String str2, byte[] bArr, String str3, String str4, S3.c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            bArr = null;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            str4 = null;
        }
        return userRepo.updateProfile(context, str, str2, bArr, str3, str4, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object addBookmark(String str, S3.c<? super C> cVar) throws Throwable {
        PostgrestQueryBuilder postgrestQueryBuilder = PostgrestKt.getPostgrest(SbClient.INSTANCE.get()).get("bookmarks");
        v vVar = new v();
        d.V("user_id", uid(), vVar);
        d.V("anime_slug", str, vVar);
        List listH = r.H(vVar.a());
        SupabaseSerializer serializer = postgrestQueryBuilder.getPostgrest().getSerializer();
        C0673c c0673c = a6.d.f10459d;
        C1447z c1447z = C1447z.f12758c;
        String strEncode = serializer.encode(y.b(List.class, AbstractC0847h.q(y.a(kotlinx.serialization.json.c.class))), listH);
        c0673c.getClass();
        kotlinx.serialization.json.a aVarD = l.d((kotlinx.serialization.json.b) c0673c.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()));
        InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        ArrayList arrayList = new ArrayList(r.p(aVarD, 10));
        Iterator it = aVarD.f12721k.iterator();
        while (it.hasNext()) {
            arrayList.add(l.e((kotlinx.serialization.json.b) it.next()).f12722k.keySet());
        }
        List listN0 = q.n0(r.t(arrayList));
        if (!listN0.isEmpty()) {
            insertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
        }
        Object objExecute = RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarD, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null), cVar);
        return objExecute == T3.a.f9048k ? objExecute : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (profile(r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0222, code lost:
    
        if (addExp(5, r2) != r3) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166 A[LOOP:0: B:44:0x0160->B:46:0x0166, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201 A[Catch: all -> 0x0225, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0225, blocks: (B:14:0x003e, B:53:0x0201), top: B:67:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addComment(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, S3.c<? super O3.C> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.addComment(java.lang.String, java.lang.String, java.lang.String, java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addExp(int r9, S3.c<? super O3.r> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.kusukanime.data.UserRepo.C07551
            if (r0 == 0) goto L14
            r0 = r10
            com.kusukanime.data.UserRepo$addExp$1 r0 = (com.kusukanime.data.UserRepo.C07551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.kusukanime.data.UserRepo$addExp$1 r0 = new com.kusukanime.data.UserRepo$addExp$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> Lbf
            goto L70
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            P3.r.Y(r10)
            com.kusukanime.data.SbClient r10 = com.kusukanime.data.SbClient.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            io.github.jan.supabase.SupabaseClient r10 = r10.get()     // Catch: java.lang.Throwable -> Lbf
            io.github.jan.supabase.postgrest.Postgrest r1 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(r10)     // Catch: java.lang.Throwable -> Lbf
            r10 = r2
            java.lang.String r2 = "add_exp"
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lbf
            r3.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r4 = "p_exp"
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            kotlinx.serialization.json.d r6 = a6.l.a(r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "element"
            kotlin.jvm.internal.l.f(r7, r6)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r4 = r3.put(r4, r6)     // Catch: java.lang.Throwable -> Lbf
            kotlinx.serialization.json.b r4 = (kotlinx.serialization.json.b) r4     // Catch: java.lang.Throwable -> Lbf
            r4 = r3
            kotlinx.serialization.json.c r3 = new kotlinx.serialization.json.c     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            r5.I$0 = r9     // Catch: java.lang.Throwable -> Lbf
            r5.label = r10     // Catch: java.lang.Throwable -> Lbf
            r6 = 4
            r7 = 0
            r4 = 0
            java.lang.Object r10 = io.github.jan.supabase.postgrest.Postgrest.rpc$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lbf
            if (r10 != r0) goto L70
            return r0
        L70:
            io.github.jan.supabase.postgrest.result.PostgrestResult r10 = (io.github.jan.supabase.postgrest.result.PostgrestResult) r10     // Catch: java.lang.Throwable -> Lbf
            io.github.jan.supabase.postgrest.Postgrest r9 = r10.getPostgrest()     // Catch: java.lang.Throwable -> Lbf
            io.github.jan.supabase.SupabaseSerializer r9 = r9.getSerializer()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r10 = r10.getData()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Class<java.util.List> r0 = java.util.List.class
            l4.z r1 = l4.C1447z.f12758c     // Catch: java.lang.Throwable -> Lbf
            java.lang.Class<com.kusukanime.data.ExpResult> r1 = com.kusukanime.data.ExpResult.class
            l4.w r1 = kotlin.jvm.internal.y.a(r1)     // Catch: java.lang.Throwable -> Lbf
            l4.z r1 = f.AbstractC0847h.q(r1)     // Catch: java.lang.Throwable -> Lbf
            l4.w r0 = kotlin.jvm.internal.y.b(r0, r1)     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r9 = r9.decode(r0, r10)     // Catch: java.lang.Throwable -> Lbf
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r9 = P3.q.t0(r9)     // Catch: java.lang.Throwable -> Lbf
            com.kusukanime.data.ExpResult r9 = (com.kusukanime.data.ExpResult) r9     // Catch: java.lang.Throwable -> Lbf
            if (r9 != 0) goto L9f
            goto Lbf
        L9f:
            O3.r r10 = new O3.r     // Catch: java.lang.Throwable -> Lbf
            int r0 = r9.getLevel()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            int r0 = r9.getExp()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lbf
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            boolean r9 = r9.getLeveled_up()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> Lbf
            r10.<init>(r1, r2, r9)     // Catch: java.lang.Throwable -> Lbf
            return r10
        Lbf:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.addExp(int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bookmarks(S3.c<? super java.util.List<com.kusukanime.data.BookmarkRow>> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.kusukanime.data.UserRepo.C07561
            if (r0 == 0) goto L13
            r0 = r14
            com.kusukanime.data.UserRepo$bookmarks$1 r0 = (com.kusukanime.data.UserRepo.C07561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kusukanime.data.UserRepo$bookmarks$1 r0 = new com.kusukanime.data.UserRepo$bookmarks$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r1 = r0.L$3
            io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder r1 = (io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder) r1
            java.lang.Object r1 = r0.L$2
            io.github.jan.supabase.postgrest.request.SelectRequest r1 = (io.github.jan.supabase.postgrest.request.SelectRequest) r1
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder r0 = (io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder) r0
            P3.r.Y(r14)
            goto Ld2
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            P3.r.Y(r14)
            com.kusukanime.data.SbClient r14 = com.kusukanime.data.SbClient.INSTANCE
            io.github.jan.supabase.SupabaseClient r14 = r14.get()
            io.github.jan.supabase.postgrest.Postgrest r14 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(r14)
            java.lang.String r2 = "bookmarks"
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder r14 = r14.get(r2)
            io.github.jan.supabase.postgrest.query.Columns$Companion r2 = io.github.jan.supabase.postgrest.query.Columns.INSTANCE
            java.lang.String r2 = r2.m20getALLU9NzzuM()
            io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder r4 = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder
            io.github.jan.supabase.postgrest.Postgrest r5 = r14.getPostgrest()
            java.lang.Object r5 = r5.getConfig()
            io.github.jan.supabase.postgrest.Postgrest$Config r5 = (io.github.jan.supabase.postgrest.Postgrest.Config) r5
            io.github.jan.supabase.postgrest.PropertyConversionMethod r5 = r5.getPropertyConversionMethod()
            r4.<init>(r5)
            io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder r6 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder
            io.github.jan.supabase.postgrest.PropertyConversionMethod r7 = r4.getPropertyConversionMethod()
            java.util.Map r8 = r4.getParams()
            r11 = 0
            r9 = 0
            r10 = 4
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r5 = "user_id"
            java.lang.String r7 = r13.uid()
            r6.eq(r5, r7)
            java.util.Map r5 = r4.getParams()
            java.util.List r2 = P3.r.H(r2)
            java.lang.String r6 = "select"
            r5.put(r6, r2)
            io.github.jan.supabase.postgrest.request.SelectRequest r7 = new io.github.jan.supabase.postgrest.request.SelectRequest
            boolean r8 = r4.getHead()
            io.github.jan.supabase.postgrest.query.Count r9 = r4.getCount()
            java.util.Map r2 = r4.getParams()
            java.util.Map r10 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(r2)
            java.lang.String r11 = r14.getSchema()
            io.ktor.http.HeadersBuilder r2 = r4.getHeaders()
            io.ktor.http.Headers r12 = r2.build()
            r7.<init>(r8, r9, r10, r11, r12)
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor r2 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE
            io.github.jan.supabase.postgrest.Postgrest r4 = r14.getPostgrest()
            java.lang.String r14 = r14.getTable()
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.L$3 = r5
            r5 = 0
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r14 = r2.execute(r4, r14, r7, r0)
            if (r14 != r1) goto Ld2
            return r1
        Ld2:
            io.github.jan.supabase.postgrest.result.PostgrestResult r14 = (io.github.jan.supabase.postgrest.result.PostgrestResult) r14
            io.github.jan.supabase.postgrest.Postgrest r0 = r14.getPostgrest()
            io.github.jan.supabase.SupabaseSerializer r0 = r0.getSerializer()
            java.lang.String r14 = r14.getData()
            l4.z r1 = l4.C1447z.f12758c
            java.lang.Class<com.kusukanime.data.BookmarkRow> r1 = com.kusukanime.data.BookmarkRow.class
            l4.w r1 = kotlin.jvm.internal.y.a(r1)
            l4.z r1 = f.AbstractC0847h.q(r1)
            java.lang.Class<java.util.List> r2 = java.util.List.class
            l4.w r1 = kotlin.jvm.internal.y.b(r2, r1)
            java.lang.Object r14 = r0.decode(r1, r14)
            java.util.List r14 = (java.util.List) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.bookmarks(S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearHistory(S3.c<? super java.lang.Integer> r15) throws java.lang.Throwable {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.kusukanime.data.UserRepo.C07571
            if (r0 == 0) goto L13
            r0 = r15
            com.kusukanime.data.UserRepo$clearHistory$1 r0 = (com.kusukanime.data.UserRepo.C07571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.kusukanime.data.UserRepo$clearHistory$1 r0 = new com.kusukanime.data.UserRepo$clearHistory$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r1 = r0.L$2
            io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder r1 = (io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder) r1
            java.lang.Object r1 = r0.L$1
            io.github.jan.supabase.postgrest.request.DeleteRequest r1 = (io.github.jan.supabase.postgrest.request.DeleteRequest) r1
            java.lang.Object r0 = r0.L$0
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder r0 = (io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder) r0
            P3.r.Y(r15)
            goto Lb9
        L35:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3d:
            P3.r.Y(r15)
            com.kusukanime.data.SbClient r15 = com.kusukanime.data.SbClient.INSTANCE
            io.github.jan.supabase.SupabaseClient r15 = r15.get()
            io.github.jan.supabase.postgrest.Postgrest r15 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(r15)
            java.lang.String r2 = "watch_history"
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder r15 = r15.get(r2)
            io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder r2 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder
            io.github.jan.supabase.postgrest.Postgrest r5 = r15.getPostgrest()
            java.lang.Object r5 = r5.getConfig()
            io.github.jan.supabase.postgrest.Postgrest$Config r5 = (io.github.jan.supabase.postgrest.Postgrest.Config) r5
            io.github.jan.supabase.postgrest.PropertyConversionMethod r5 = r5.getPropertyConversionMethod()
            r2.<init>(r5)
            io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder r6 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder
            io.github.jan.supabase.postgrest.PropertyConversionMethod r7 = r2.getPropertyConversionMethod()
            java.util.Map r8 = r2.getParams()
            r10 = 4
            r11 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r5 = "user_id"
            java.lang.String r7 = r14.uid()
            r6.eq(r5, r7)
            io.github.jan.supabase.postgrest.request.DeleteRequest r8 = new io.github.jan.supabase.postgrest.request.DeleteRequest
            io.github.jan.supabase.postgrest.query.Returning r9 = r2.getReturning()
            io.github.jan.supabase.postgrest.query.Count r10 = r2.getCount()
            java.util.Map r5 = r2.getParams()
            java.util.Map r11 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(r5)
            java.lang.String r12 = r15.getSchema()
            io.ktor.http.HeadersBuilder r2 = r2.getHeaders()
            io.ktor.http.Headers r13 = r2.build()
            r8.<init>(r9, r10, r11, r12, r13)
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor r2 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE
            io.github.jan.supabase.postgrest.Postgrest r5 = r15.getPostgrest()
            java.lang.String r15 = r15.getTable()
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r15 = r2.execute(r5, r15, r8, r0)
            if (r15 != r1) goto Lb9
            return r1
        Lb9:
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r3)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.clearHistory(S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object commentLikes(java.util.List<java.lang.String> r13, S3.c<? super java.util.List<com.kusukanime.data.LikeRow>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.commentLikes(java.util.List, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object comments(java.lang.String r17, java.lang.String r18, S3.c<? super java.util.List<com.kusukanime.data.CommentRow>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.comments(java.lang.String, java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object delBookmark(String str, S3.c<? super C> cVar) throws Throwable {
        PostgrestQueryBuilder postgrestQueryBuilder = PostgrestKt.getPostgrest(SbClient.INSTANCE.get()).get("bookmarks");
        PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
        PostgrestFilterBuilder postgrestFilterBuilder = new PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
        postgrestFilterBuilder.eq("user_id", uid());
        postgrestFilterBuilder.eq("anime_slug", str);
        Object objExecute = RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
        return objExecute == T3.a.f9048k ? objExecute : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object episodeVoteStats(java.lang.String r9, S3.c<? super com.kusukanime.data.EpisodeVoteStats> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.kusukanime.data.UserRepo.C07601
            if (r0 == 0) goto L14
            r0 = r10
            com.kusukanime.data.UserRepo$episodeVoteStats$1 r0 = (com.kusukanime.data.UserRepo.C07601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.kusukanime.data.UserRepo$episodeVoteStats$1 r0 = new com.kusukanime.data.UserRepo$episodeVoteStats$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r9 = r5.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r10)
            goto L61
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            P3.r.Y(r10)
            com.kusukanime.data.SbClient r10 = com.kusukanime.data.SbClient.INSTANCE
            io.github.jan.supabase.SupabaseClient r10 = r10.get()
            io.github.jan.supabase.postgrest.Postgrest r1 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(r10)
            a6.v r10 = new a6.v
            r10.<init>()
            java.lang.String r3 = "p_episode"
            n6.d.V(r3, r9, r10)
            kotlinx.serialization.json.c r3 = r10.a()
            r9 = 0
            r5.L$0 = r9
            r5.label = r2
            java.lang.String r2 = "episode_vote_stats"
            r4 = 0
            r6 = 4
            r7 = 0
            java.lang.Object r10 = io.github.jan.supabase.postgrest.Postgrest.rpc$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L61
            return r0
        L61:
            io.github.jan.supabase.postgrest.result.PostgrestResult r10 = (io.github.jan.supabase.postgrest.result.PostgrestResult) r10
            io.github.jan.supabase.postgrest.Postgrest r9 = r10.getPostgrest()
            io.github.jan.supabase.SupabaseSerializer r9 = r9.getSerializer()
            java.lang.String r10 = r10.getData()
            java.lang.Class<com.kusukanime.data.EpisodeVoteStats> r0 = com.kusukanime.data.EpisodeVoteStats.class
            l4.w r0 = kotlin.jvm.internal.y.a(r0)
            java.lang.Object r9 = r9.decode(r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.episodeVoteStats(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object history(int r14, S3.c<? super java.util.List<com.kusukanime.data.HistoryRow>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.history(int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:142|(1:(1:(1:(5:13|14|15|131|(1:158)(2:134|135))(2:16|17))(5:18|138|19|20|128))(1:22))(3:24|(1:27)|130)|23|28|140|29|(1:31)(1:33)|(1:40)(1:39)|41|(1:48)(1:47)|(1:55)(1:54)|56|(1:61)(1:60)|62|(2:63|(2:65|(2:149|147)(1:146))(2:144|70))|71|(1:78)(1:77)|(1:85)(1:84)|86|(2:87|(2:89|(2:155|153)(1:152))(2:150|94))|95|(1:103)(1:102)|(1:(13:(1:111)|112|(1:114)|115|(2:118|116)|156|119|(1:121)|122|(1:124)|125|(1:127)(1:128)|130)(1:109))(1:106)) */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04be, code lost:
    
        if (r0 != r5) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object profile(S3.c<? super com.kusukanime.data.ProfileRow> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.profile(S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b0, code lost:
    
        if (addExp(10, r6) == r7) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveHistory(java.lang.String r26, java.lang.String r27, long r28, long r30, S3.c<? super O3.C> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.saveHistory(java.lang.String, java.lang.String, long, long, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setUsername(java.lang.String r11, S3.c<? super com.kusukanime.data.ProfileRow> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.setUsername(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object toggleLike(String str, String str2, boolean z7, S3.c<? super C> cVar) throws Throwable {
        C c2 = C.a;
        if (z7) {
            PostgrestQueryBuilder postgrestQueryBuilder = PostgrestKt.getPostgrest(SbClient.INSTANCE.get()).get("likes");
            v vVar = new v();
            d.V("user_id", uid(), vVar);
            d.V("target_type", str, vVar);
            d.V("target_id", str2, vVar);
            List listH = r.H(vVar.a());
            SupabaseSerializer serializer = postgrestQueryBuilder.getPostgrest().getSerializer();
            C0673c c0673c = a6.d.f10459d;
            C1447z c1447z = C1447z.f12758c;
            String strEncode = serializer.encode(y.b(List.class, AbstractC0847h.q(y.a(kotlinx.serialization.json.c.class))), listH);
            c0673c.getClass();
            kotlinx.serialization.json.a aVarD = l.d((kotlinx.serialization.json.b) c0673c.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()));
            InsertRequestBuilder insertRequestBuilder = new InsertRequestBuilder(((Postgrest.Config) postgrestQueryBuilder.getPostgrest().getConfig()).getPropertyConversionMethod());
            ArrayList arrayList = new ArrayList(r.p(aVarD, 10));
            Iterator it = aVarD.f12721k.iterator();
            while (it.hasNext()) {
                arrayList.add(l.e((kotlinx.serialization.json.b) it.next()).f12722k.keySet());
            }
            List listN0 = q.n0(r.t(arrayList));
            if (!listN0.isEmpty()) {
                insertRequestBuilder.getParams().put("columns", r.H(q.y0(listN0, ",", null, null, null, 62)));
            }
            boolean z8 = false;
            boolean z9 = false;
            Object objExecute = RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder.getPostgrest(), postgrestQueryBuilder.getTable(), new InsertRequest(z8, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), z9, insertRequestBuilder.getDefaultToNull(), aVarD, UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilder.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null), cVar);
            if (objExecute == T3.a.f9048k) {
                return objExecute;
            }
        } else {
            PostgrestQueryBuilder postgrestQueryBuilder2 = PostgrestKt.getPostgrest(SbClient.INSTANCE.get()).get("likes");
            PostgrestRequestBuilder postgrestRequestBuilder = new PostgrestRequestBuilder(((Postgrest.Config) postgrestQueryBuilder2.getPostgrest().getConfig()).getPropertyConversionMethod());
            PostgrestFilterBuilder postgrestFilterBuilder = new PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
            postgrestFilterBuilder.eq("user_id", uid());
            postgrestFilterBuilder.eq("target_type", str);
            postgrestFilterBuilder.eq("target_id", str2);
            Object objExecute2 = RestRequestExecutor.INSTANCE.execute(postgrestQueryBuilder2.getPostgrest(), postgrestQueryBuilder2.getTable(), new DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilder2.getSchema(), postgrestRequestBuilder.getHeaders().build()), cVar);
            if (objExecute2 == T3.a.f9048k) {
                return objExecute2;
            }
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x037d, code lost:
    
        if (r2 != r6) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02eb A[PHI: r0 r1
      0x02eb: PHI (r0v14 java.lang.String) = (r0v10 java.lang.String), (r0v43 java.lang.String) binds: [B:92:0x02e7, B:16:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r1v17 io.github.jan.supabase.SupabaseClient) = (r1v14 io.github.jan.supabase.SupabaseClient), (r1v25 io.github.jan.supabase.SupabaseClient) binds: [B:92:0x02e7, B:16:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateProfile(android.content.Context r26, java.lang.String r27, java.lang.String r28, byte[] r29, java.lang.String r30, java.lang.String r31, S3.c<? super com.kusukanime.data.ProfileRow> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.updateProfile(android.content.Context, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object voteEpisode(java.lang.String r9, int r10, S3.c<? super com.kusukanime.data.EpisodeVoteStats> r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.kusukanime.data.UserRepo.C07661
            if (r0 == 0) goto L14
            r0 = r11
            com.kusukanime.data.UserRepo$voteEpisode$1 r0 = (com.kusukanime.data.UserRepo.C07661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.kusukanime.data.UserRepo$voteEpisode$1 r0 = new com.kusukanime.data.UserRepo$voteEpisode$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r9 = r5.L$0
            java.lang.String r9 = (java.lang.String) r9
            P3.r.Y(r11)
            goto L71
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            P3.r.Y(r11)
            com.kusukanime.data.SbClient r11 = com.kusukanime.data.SbClient.INSTANCE
            io.github.jan.supabase.SupabaseClient r11 = r11.get()
            io.github.jan.supabase.postgrest.Postgrest r1 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(r11)
            a6.v r11 = new a6.v
            r11.<init>()
            java.lang.String r3 = "p_episode"
            n6.d.V(r3, r9, r11)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            kotlinx.serialization.json.d r9 = a6.l.a(r9)
            java.lang.String r3 = "p_value"
            r11.b(r3, r9)
            kotlinx.serialization.json.c r3 = r11.a()
            r9 = 0
            r5.L$0 = r9
            r5.I$0 = r10
            r5.label = r2
            r6 = 4
            r7 = 0
            java.lang.String r2 = "vote_episode"
            r4 = 0
            java.lang.Object r11 = io.github.jan.supabase.postgrest.Postgrest.rpc$default(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L71
            return r0
        L71:
            io.github.jan.supabase.postgrest.result.PostgrestResult r11 = (io.github.jan.supabase.postgrest.result.PostgrestResult) r11
            io.github.jan.supabase.postgrest.Postgrest r9 = r11.getPostgrest()
            io.github.jan.supabase.SupabaseSerializer r9 = r9.getSerializer()
            java.lang.String r10 = r11.getData()
            java.lang.Class<com.kusukanime.data.EpisodeVoteStats> r11 = com.kusukanime.data.EpisodeVoteStats.class
            l4.w r11 = kotlin.jvm.internal.y.a(r11)
            java.lang.Object r9 = r9.decode(r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.UserRepo.voteEpisode(java.lang.String, int, S3.c):java.lang.Object");
    }
}
