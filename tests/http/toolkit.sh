while [[ $# -ge 1 ]]
    do
    case $1 in
        -c|--clean-cache)
            find ./data/posts -name *.147* -delete
            shift
        ;;
        -r|--users-ranking)
            find ./data/users -name data -exec awk 'NR == 8 {split("{}", a, "/"); print a[5] " " $0; exit }' {} \; > ./data/users/list
            shift
        ;;
    esac
    shift
done