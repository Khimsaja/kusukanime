package s3;

import b1.AbstractC0703b;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.AzItem;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.FeedItem;
import com.kusukanime.data.GenreItem;
import com.kusukanime.data.HistoryRow;
import com.kusukanime.data.ScheduleItem;
import io.ktor.util.GzipHeaderFlags;
import java.io.File;
import x.C2228b;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15632k;

    public /* synthetic */ T(int i7) {
        this.f15632k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f15632k) {
            case 0:
                EpisodeRef episodeRef = (EpisodeRef) obj;
                kotlin.jvm.internal.l.f("it", episodeRef);
                String slug = episodeRef.getSlug();
                return AbstractC2510o.g0(slug) ? AbstractC0703b.g(episodeRef.getN(), "ep-") : slug;
            case 1:
                AzItem azItem = (AzItem) obj;
                kotlin.jvm.internal.l.f("it", azItem);
                return azItem.getSlug();
            case 2:
                GenreItem genreItem = (GenreItem) obj;
                kotlin.jvm.internal.l.f("it", genreItem);
                return genreItem.getSlug();
            case 3:
                AnimeItem animeItem = (AnimeItem) obj;
                kotlin.jvm.internal.l.f("it", animeItem);
                return animeItem.getSlug();
            case GzipHeaderFlags.EXTRA /* 4 */:
                HistoryRow historyRow = (HistoryRow) obj;
                kotlin.jvm.internal.l.f("it", historyRow);
                String id = historyRow.getId();
                return AbstractC2510o.g0(id) ? historyRow.getEpisode_slug() : id;
            case 5:
                ScheduleItem scheduleItem = (ScheduleItem) obj;
                kotlin.jvm.internal.l.f("it", scheduleItem);
                return A6.b.h(scheduleItem.getSlug(), scheduleItem.getTitle());
            case 6:
                HistoryRow historyRow2 = (HistoryRow) obj;
                kotlin.jvm.internal.l.f("it", historyRow2);
                String id2 = historyRow2.getId();
                return AbstractC2510o.g0(id2) ? historyRow2.getEpisode_slug() : id2;
            case 7:
                AnimeItem animeItem2 = (AnimeItem) obj;
                kotlin.jvm.internal.l.f("it", animeItem2);
                return animeItem2.getSlug();
            case 8:
                GenreItem genreItem2 = (GenreItem) obj;
                kotlin.jvm.internal.l.f("it", genreItem2);
                return genreItem2.getSlug();
            case 9:
                FeedItem feedItem = (FeedItem) obj;
                kotlin.jvm.internal.l.f("it", feedItem);
                return feedItem.getEpisode_slug();
            case 10:
                kotlin.jvm.internal.l.f("$this$item", (x.r) obj);
                return new C2228b(2);
            case 11:
                File file = (File) obj;
                kotlin.jvm.internal.l.f("it", file);
                return CrashLog.INSTANCE.read(file);
            case 12:
                ((Long) obj).getClass();
                return O3.C.a;
            case 13:
                return O3.C.a;
            case 14:
                y5.h hVar = (y5.h) obj;
                kotlin.jvm.internal.l.f("it", hVar);
                return hVar.iterator();
            case 15:
                return obj;
            case 16:
                return Boolean.valueOf(obj == null);
            default:
                ScheduleItem scheduleItem2 = (ScheduleItem) obj;
                kotlin.jvm.internal.l.f("it", scheduleItem2);
                return A6.b.h(scheduleItem2.getSlug(), scheduleItem2.getTitle());
        }
    }
}
