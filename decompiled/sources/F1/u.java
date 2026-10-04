package F1;

import B1.AbstractC0015b;
import android.database.SQLException;
import android.os.ConditionVariable;
import j3.J;
import j3.l0;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f2215j = new HashSet();
    public final File a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2216b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.b f2217c;

    /* renamed from: d, reason: collision with root package name */
    public final g f2218d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2219e;

    /* renamed from: f, reason: collision with root package name */
    public final Random f2220f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2221g;

    /* renamed from: h, reason: collision with root package name */
    public long f2222h;

    /* renamed from: i, reason: collision with root package name */
    public a f2223i;

    public u(File file, r rVar, D1.b bVar) {
        boolean zAdd;
        B0.b bVar2 = new B0.b(bVar, file);
        g gVar = new g(bVar);
        synchronized (u.class) {
            zAdd = f2215j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.a = file;
        this.f2216b = rVar;
        this.f2217c = bVar2;
        this.f2218d = gVar;
        this.f2219e = new HashMap();
        this.f2220f = new Random();
        this.f2221g = true;
        this.f2222h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new t(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(u uVar) throws NumberFormatException {
        long j7;
        B0.b bVar = uVar.f2217c;
        File file = uVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (a e7) {
                uVar.f2223i = e7;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC0015b.m("SimpleCache", str);
            uVar.f2223i = new a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                j7 = -1;
                break;
            }
            File file2 = fileArrListFiles[i7];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j7 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    AbstractC0015b.m("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i7++;
        }
        uVar.f2222h = j7;
        if (j7 == -1) {
            try {
                uVar.f2222h = f(file);
            } catch (IOException e8) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC0015b.n("SimpleCache", str2, e8);
                uVar.f2223i = new a(str2, e8);
                return;
            }
        }
        try {
            bVar.n(uVar.f2222h);
            g gVar = uVar.f2218d;
            if (gVar != null) {
                gVar.c(uVar.f2222h);
                HashMap mapB = gVar.b();
                uVar.i(file, true, fileArrListFiles, mapB);
                gVar.d(mapB.keySet());
            } else {
                uVar.i(file, true, fileArrListFiles, null);
            }
            l0 it = J.s(((HashMap) bVar.f275k).keySet()).iterator();
            while (it.hasNext()) {
                bVar.x((String) it.next());
            }
            try {
                bVar.y();
            } catch (IOException e9) {
                AbstractC0015b.n("SimpleCache", "Storing index file failed", e9);
            }
        } catch (IOException e10) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC0015b.n("SimpleCache", str3, e10);
            uVar.f2223i = new a(str3, e10);
        }
    }

    public static void e(File file) throws a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC0015b.m("SimpleCache", str);
        throw new a(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, A6.b.h(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(v vVar) {
        B0.b bVar = this.f2217c;
        String str = vVar.f2190k;
        bVar.m(str).f2198c.add(vVar);
        ArrayList arrayList = (ArrayList) this.f2219e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((r) arrayList.get(size)).b(this, vVar);
            }
        }
        this.f2216b.b(this, vVar);
    }

    public final synchronized void c(String str, g gVar) {
        d();
        B0.b bVar = this.f2217c;
        k kVarM = bVar.m(str);
        p pVar = kVarM.f2200e;
        p pVarB = pVar.b(gVar);
        kVarM.f2200e = pVarB;
        if (!pVarB.equals(pVar)) {
            ((n) bVar.f279o).f(kVarM);
        }
        try {
            this.f2217c.y();
        } catch (IOException e7) {
            throw new a(e7);
        }
    }

    public final synchronized void d() {
        a aVar = this.f2223i;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final synchronized p g(String str) {
        k kVarK;
        kVarK = this.f2217c.k(str);
        return kVarK != null ? kVarK.f2200e : p.f2209c;
    }

    public final v h(long j7, long j8, String str) throws D1.a {
        v vVar;
        long j9;
        k kVarK = this.f2217c.k(str);
        if (kVarK == null) {
            return new v(str, j7, j8, -9223372036854775807L, null);
        }
        while (true) {
            v vVar2 = new v(kVarK.f2197b, j7, -1L, -9223372036854775807L, null);
            TreeSet treeSet = kVarK.f2198c;
            vVar = (v) treeSet.floor(vVar2);
            if (vVar == null || vVar.f2191l + vVar.f2192m <= j7) {
                v vVar3 = (v) treeSet.ceiling(vVar2);
                if (vVar3 != null) {
                    long jMin = vVar3.f2191l - j7;
                    if (j8 != -1) {
                        jMin = Math.min(jMin, j8);
                    }
                    j9 = jMin;
                } else {
                    j9 = j8;
                }
                vVar = new v(kVarK.f2197b, j7, j9, -9223372036854775807L, null);
            }
            if (!vVar.f2193n) {
                break;
            }
            File file = vVar.f2194o;
            file.getClass();
            if (file.length() == vVar.f2192m) {
                break;
            }
            m();
        }
        return vVar;
    }

    public final void i(File file, boolean z7, File[] fileArr, HashMap map) {
        long j7;
        long j8;
        if (fileArr == null || fileArr.length == 0) {
            if (z7) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z7 && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z7 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                f fVar = map != null ? (f) map.remove(name) : null;
                if (fVar != null) {
                    j7 = fVar.a;
                    j8 = fVar.f2187b;
                } else {
                    j7 = -1;
                    j8 = -9223372036854775807L;
                }
                v vVarB = v.b(file2, j7, j8, this.f2217c);
                if (vVarB != null) {
                    b(vVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(v vVar) {
        k kVarK = this.f2217c.k(vVar.f2190k);
        kVarK.getClass();
        long j7 = vVar.f2191l;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = kVarK.f2199d;
            if (i7 >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (((j) arrayList.get(i7)).a == j7) {
                arrayList.remove(i7);
                this.f2217c.x(kVarK.f2197b);
                notifyAll();
            } else {
                i7++;
            }
        }
    }

    public final synchronized void k(String str) {
        k kVarK;
        synchronized (this) {
            try {
                kVarK = this.f2217c.k(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((kVarK == null || kVarK.f2198c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) kVarK.f2198c)).iterator();
        while (it.hasNext()) {
            l((i) it.next());
        }
    }

    public final void l(i iVar) throws D1.a {
        String str = iVar.f2190k;
        B0.b bVar = this.f2217c;
        k kVarK = bVar.k(str);
        if (kVarK == null || !kVarK.f2198c.remove(iVar)) {
            return;
        }
        File file = iVar.f2194o;
        if (file != null) {
            file.delete();
        }
        g gVar = this.f2218d;
        if (gVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) gVar.f2189b).getClass();
                try {
                    ((D1.b) gVar.a).getWritableDatabase().delete((String) gVar.f2189b, "name = ?", new String[]{name});
                } catch (SQLException e7) {
                    throw new D1.a(e7);
                }
            } catch (IOException unused) {
                A6.b.p("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        bVar.x(kVarK.f2197b);
        ArrayList arrayList = (ArrayList) this.f2219e.get(iVar.f2190k);
        long j7 = iVar.f2192m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r rVar = (r) arrayList.get(size);
                rVar.a.remove(iVar);
                rVar.f2211b -= j7;
            }
        }
        r rVar2 = this.f2216b;
        rVar2.a.remove(iVar);
        rVar2.f2211b -= j7;
    }

    public final void m() throws D1.a {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f2217c.f275k).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((k) it.next()).f2198c.iterator();
            while (it2.hasNext()) {
                i iVar = (i) it2.next();
                File file = iVar.f2194o;
                file.getClass();
                if (file.length() != iVar.f2192m) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            l((i) arrayList.get(i7));
        }
    }

    public final synchronized v n(long j7, long j8, String str) {
        d();
        v vVarH = h(j7, j8, str);
        if (vVarH.f2193n) {
            return o(str, vVarH);
        }
        k kVarM = this.f2217c.m(str);
        long j9 = vVarH.f2192m;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = kVarM.f2199d;
            if (i7 >= arrayList.size()) {
                arrayList.add(new j(j7, j9));
                return vVarH;
            }
            j jVar = (j) arrayList.get(i7);
            long j10 = jVar.a;
            if (j10 <= j7) {
                long j11 = jVar.f2196b;
                if (j11 == -1 || j10 + j11 > j7) {
                    break;
                }
                i7++;
            } else {
                if (j9 == -1 || j7 + j9 > j10) {
                    break;
                }
                i7++;
            }
        }
        return null;
    }

    public final v o(String str, v vVar) throws SQLException {
        boolean z7;
        File file;
        if (!this.f2221g) {
            return vVar;
        }
        File file2 = vVar.f2194o;
        file2.getClass();
        String name = file2.getName();
        long j7 = vVar.f2192m;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = this.f2218d;
        if (gVar != null) {
            try {
                gVar.e(j7, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                AbstractC0015b.v("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z7 = false;
        } else {
            z7 = true;
        }
        k kVarK = this.f2217c.k(str);
        kVarK.getClass();
        TreeSet treeSet = kVarK.f2198c;
        AbstractC0015b.h(treeSet.remove(vVar));
        file2.getClass();
        if (z7) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = v.c(parentFile, kVarK.a, vVar.f2191l, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                AbstractC0015b.v("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        AbstractC0015b.h(vVar.f2193n);
        v vVar2 = new v(vVar.f2190k, vVar.f2191l, vVar.f2192m, jCurrentTimeMillis, file);
        treeSet.add(vVar2);
        ArrayList arrayList = (ArrayList) this.f2219e.get(vVar.f2190k);
        long j8 = vVar.f2192m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                r rVar = (r) arrayList.get(size);
                rVar.a.remove(vVar);
                rVar.f2211b -= j8;
                rVar.b(this, vVar2);
            }
        }
        r rVar2 = this.f2216b;
        rVar2.a.remove(vVar);
        rVar2.f2211b -= j8;
        rVar2.b(this, vVar2);
        return vVar2;
    }
}
