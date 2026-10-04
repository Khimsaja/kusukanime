package Z3;

import D6.r;
import P3.AbstractC0561b;
import java.io.File;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends AbstractC0561b {

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f10259m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f10260n;

    public f(h hVar) {
        this.f10260n = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10259m = arrayDeque;
        boolean zIsDirectory = ((File) hVar.f10261b).isDirectory();
        File file = (File) hVar.f10261b;
        if (zIsDirectory) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new d(file));
        } else {
            this.f7756k = 2;
        }
    }

    @Override // P3.AbstractC0561b
    public final void a() {
        File file;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f10259m;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(gVar.a) || !fileA.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f10260n.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
        }
        file = fileA;
        if (file == null) {
            this.f7756k = 2;
        } else {
            this.f7757l = file;
            this.f7756k = 1;
        }
    }

    public final b b(File file) {
        int iOrdinal = ((i) this.f10260n.f10262c).ordinal();
        if (iOrdinal == 0) {
            return new e(this, file);
        }
        if (iOrdinal == 1) {
            return new c(this, file);
        }
        throw new r();
    }
}
