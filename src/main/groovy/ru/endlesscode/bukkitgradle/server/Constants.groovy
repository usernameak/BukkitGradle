package ru.endlesscode.bukkitgradle.server

class ServerConstants {
    public static final String FILE_CORE = "core.jar"

    public static final String FILE_BUILDTOOLS = "BuildTools.jar"
    public static final String FILE_MAVEN_METADATA = "maven-metadata.xml"

    public static final String URL_BUKKIT_METADATA = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/bukkit/bukkit/$FILE_MAVEN_METADATA"
}

class PaperConstants {
    public static final String FILE_PAPERCLIP = "paperclip.jar"
    public static final String FILE_PAPER_VERSIONS = "paper-versions.json"

    public static final String URL_PAPER_VERSIONS = "https://gist.githubusercontent.com/usernameak/ff46b3d4e407b0e86a8a61785555966d/raw/$FILE_PAPER_VERSIONS"
    public static final String URL_PAPER_DEFAULT = "https://papermc.io/ci/job/Paper-1.15/lastSuccessfulBuild/artifact/paperclip.jar"
}
